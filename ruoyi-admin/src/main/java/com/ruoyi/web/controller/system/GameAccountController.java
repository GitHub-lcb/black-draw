package com.ruoyi.web.controller.system;

import java.util.List;
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
import com.ruoyi.system.domain.GameAccount;
import com.ruoyi.system.service.IGameAccountService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 游戏用户Controller
 * 
 * @author lcb
 * @date 2020-12-03
 */
@RestController
@RequestMapping("/system/account")
public class GameAccountController extends BaseController
{
    @Autowired
    private IGameAccountService gameAccountService;

    /**
     * 查询游戏用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:account:list')")
    @GetMapping("/list")
    public TableDataInfo list(GameAccount gameAccount)
    {
        startPage();
        List<GameAccount> list = gameAccountService.selectGameAccountList(gameAccount);
        return getDataTable(list);
    }

    /**
     * 导出游戏用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:account:export')")
    @Log(title = "游戏用户", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(GameAccount gameAccount)
    {
        List<GameAccount> list = gameAccountService.selectGameAccountList(gameAccount);
        ExcelUtil<GameAccount> util = new ExcelUtil<GameAccount>(GameAccount.class);
        return util.exportExcel(list, "account");
    }

    /**
     * 获取游戏用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:account:query')")
    @GetMapping(value = "/{uid}")
    public AjaxResult getInfo(@PathVariable("uid") Integer uid)
    {
        return AjaxResult.success(gameAccountService.selectGameAccountById(uid));
    }

    /**
     * 新增游戏用户
     */
    @PreAuthorize("@ss.hasPermi('system:account:add')")
    @Log(title = "游戏用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GameAccount gameAccount)
    {
        return toAjax(gameAccountService.insertGameAccount(gameAccount));
    }

    /**
     * 修改游戏用户
     */
    @PreAuthorize("@ss.hasPermi('system:account:edit')")
    @Log(title = "游戏用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GameAccount gameAccount)
    {
        return toAjax(gameAccountService.updateGameAccount(gameAccount));
    }

    /**
     * 删除游戏用户
     */
    @PreAuthorize("@ss.hasPermi('system:account:remove')")
    @Log(title = "游戏用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uids}")
    public AjaxResult remove(@PathVariable Integer[] uids)
    {
        return toAjax(gameAccountService.deleteGameAccountByIds(uids));
    }
}
