package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.vo.DrawBaoDi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DrawRecordMapper;
import com.ruoyi.system.domain.DrawRecord;
import com.ruoyi.system.service.IDrawRecordService;

/**
 * 抽奖记录Service业务层处理
 * 
 * @author lcb
 * @date 2020-12-03
 */
@Service
public class DrawRecordServiceImpl implements IDrawRecordService 
{
    @Autowired
    private DrawRecordMapper drawRecordMapper;

    /**
     * 查询抽奖记录
     * 
     * @param id 抽奖记录ID
     * @return 抽奖记录
     */
    @Override
    public DrawRecord selectDrawRecordById(Long id)
    {
        return drawRecordMapper.selectDrawRecordById(id);
    }

    /**
     * 查询抽奖记录列表
     * 
     * @param drawRecord 抽奖记录
     * @return 抽奖记录
     */
    @Override
    public List<DrawRecord> selectDrawRecordList(DrawRecord drawRecord)
    {
        return drawRecordMapper.selectDrawRecordList(drawRecord);
    }

    /**
     * 新增抽奖记录
     * 
     * @param drawRecord 抽奖记录
     * @return 结果
     */
    @Override
    public int insertDrawRecord(DrawRecord drawRecord)
    {
        drawRecord.setCreateTime(DateUtils.getNowDate());
        return drawRecordMapper.insertDrawRecord(drawRecord);
    }

    /**
     * 修改抽奖记录
     * 
     * @param drawRecord 抽奖记录
     * @return 结果
     */
    @Override
    public int updateDrawRecord(DrawRecord drawRecord)
    {
        drawRecord.setUpdateTime(DateUtils.getNowDate());
        return drawRecordMapper.updateDrawRecord(drawRecord);
    }

    /**
     * 批量删除抽奖记录
     * 
     * @param ids 需要删除的抽奖记录ID
     * @return 结果
     */
    @Override
    public int deleteDrawRecordByIds(Long[] ids)
    {
        return drawRecordMapper.deleteDrawRecordByIds(ids);
    }

    /**
     * 删除抽奖记录信息
     * 
     * @param id 抽奖记录ID
     * @return 结果
     */
    @Override
    public int deleteDrawRecordById(Long id)
    {
        return drawRecordMapper.deleteDrawRecordById(id);
    }

    @Override
    public int getTotalCount(String userName) {
        return drawRecordMapper.getTotalCount(userName);
    }

    @Override
    public List<DrawBaoDi> selectBaodi() {
        return drawRecordMapper.selectBaodi();
    }
}
