package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.utils.sign.SignUtils;
import com.ruoyi.framework.web.service.TokenService;
import com.ruoyi.system.domain.DrawRecord;
import com.ruoyi.system.service.IDrawRecordService;
import com.ruoyi.system.service.ISysDictDataService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ScoreRecord;
import com.ruoyi.system.service.IScoreRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 积分兑换Controller
 *
 * @author lcb
 * @date 2020-12-07
 */
@RestController
@RequestMapping("/system/score")
public class ScoreRecordController extends BaseController {
    private static final String gmUrl = "http://gm-sszg.lichenbo.cn/gm9/user/gmquery.php";

    @Autowired
    private IScoreRecordService scoreRecordService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ISysDictDataService dictDataService;

    @Autowired
    private IDrawRecordService drawRecordService;


    /**
     * 查询积分兑换列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScoreRecord scoreRecord) {
        initDrawRecord(scoreRecord);
        startPage();
        List<ScoreRecord> list = scoreRecordService.selectScoreRecordList(scoreRecord);
        return getDataTable(list);
    }
    private void initDrawRecord(ScoreRecord drawRecord) {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        String username = user.getUserName();
        if (!"admin_lcb".equals(username)){
            drawRecord.setCreateBy(username);
        }
    }

    /**
     * 导出积分兑换列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:export')")
    @Log(title = "积分兑换", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ScoreRecord scoreRecord) {
        List<ScoreRecord> list = scoreRecordService.selectScoreRecordList(scoreRecord);
        ExcelUtil<ScoreRecord> util = new ExcelUtil<ScoreRecord>(ScoreRecord.class);
        return util.exportExcel(list, "score");
    }

    /**
     * 获取积分兑换详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:score:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(scoreRecordService.selectScoreRecordById(id));
    }

    /**
     * 新增积分兑换
     */
    @PreAuthorize("@ss.hasPermi('system:score:add')")
    @Log(title = "积分兑换", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScoreRecord scoreRecord) {

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        scoreRecord.setCreateBy(loginUser.getUsername());
        String item = scoreRecord.getGoods();
        String hero = dictDataService.selectDictLabel("hero", item);
        scoreRecord.setGoods(hero);
        // 检查积分
        int totalCount = drawRecordService.getTotalCount(loginUser.getUsername());
        if (totalCount < 50){
            return AjaxResult.error("抽奖次数（积分）不足");
        }
        // 查询之前是否兑换过,最新的记录
        scoreRecord.setScoreCost(50L);
        scoreRecord.setScoreTotal((long) totalCount);
        ScoreRecord record = scoreRecordService.selectScoreRecordByUserName(loginUser.getUsername());
        // 扣除积分
        if (record == null){
            // 第一次
            scoreRecord.setScoreRemain((long) (totalCount-50));
        } else {
            Long scoreRemain = record.getScoreRemain();
            if (totalCount > record.getScoreTotal()){
                // 次数有新增
                scoreRecord.setScoreTotal((long) totalCount);
                scoreRemain += (totalCount-record.getScoreTotal());
            }
            if (scoreRemain < 50){
                if (totalCount != record.getScoreTotal()){
                    scoreRecord.setScoreRemain(scoreRemain);
                    scoreRecordService.insertScoreRecord(scoreRecord);
                }
                return AjaxResult.error("抽奖次数（积分）不足");
            }
            scoreRecord.setScoreRemain(scoreRemain-50);
        }
        // 发送物品
        if (item.equals("10091") || item.equals("24")){
            sendEmail(item,loginUser.getUsername(),50,"daoju");
        } else {
            sendEmail(item,loginUser.getUsername(),1,"daoju");
        }

       // 数据入库
        return toAjax(scoreRecordService.insertScoreRecord(scoreRecord));
    }
    private String sendEmail(String item, String uid, int num, String type) {
        // 发送邮件
        String paramEmail = "type=" + type + "&qu=1&checknum=952000&item=" + item + "&uid=" + uid + "&num=" + num;
        String sign = SignUtils.getSign(paramEmail);
        return HttpUtils.sendPost(gmUrl, paramEmail + "&sign=" + sign);
    }

    /**
     * 修改积分兑换
     */
    @PreAuthorize("@ss.hasPermi('system:score:edit')")
    @Log(title = "积分兑换", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScoreRecord scoreRecord) {
        return toAjax(scoreRecordService.updateScoreRecord(scoreRecord));
    }

    /**
     * 删除积分兑换
     */
    @PreAuthorize("@ss.hasPermi('system:score:remove')")
    @Log(title = "积分兑换", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(scoreRecordService.deleteScoreRecordByIds(ids));
    }
}
