package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ScoreRecordMapper;
import com.ruoyi.system.domain.ScoreRecord;
import com.ruoyi.system.service.IScoreRecordService;

/**
 * 积分兑换Service业务层处理
 * 
 * @author lcb
 * @date 2020-12-07
 */
@Service
public class ScoreRecordServiceImpl implements IScoreRecordService 
{
    @Autowired
    private ScoreRecordMapper scoreRecordMapper;

    /**
     * 查询积分兑换
     * 
     * @param id 积分兑换ID
     * @return 积分兑换
     */
    @Override
    public ScoreRecord selectScoreRecordById(Long id)
    {
        return scoreRecordMapper.selectScoreRecordById(id);
    }

    /**
     * 查询积分兑换列表
     * 
     * @param scoreRecord 积分兑换
     * @return 积分兑换
     */
    @Override
    public List<ScoreRecord> selectScoreRecordList(ScoreRecord scoreRecord)
    {
        return scoreRecordMapper.selectScoreRecordList(scoreRecord);
    }

    /**
     * 新增积分兑换
     * 
     * @param scoreRecord 积分兑换
     * @return 结果
     */
    @Override
    public int insertScoreRecord(ScoreRecord scoreRecord)
    {
        scoreRecord.setCreateTime(DateUtils.getNowDate());

        return scoreRecordMapper.insertScoreRecord(scoreRecord);
    }

    /**
     * 修改积分兑换
     * 
     * @param scoreRecord 积分兑换
     * @return 结果
     */
    @Override
    public int updateScoreRecord(ScoreRecord scoreRecord)
    {
        scoreRecord.setUpdateTime(DateUtils.getNowDate());
        return scoreRecordMapper.updateScoreRecord(scoreRecord);
    }

    /**
     * 批量删除积分兑换
     * 
     * @param ids 需要删除的积分兑换ID
     * @return 结果
     */
    @Override
    public int deleteScoreRecordByIds(Long[] ids)
    {
        return scoreRecordMapper.deleteScoreRecordByIds(ids);
    }

    /**
     * 删除积分兑换信息
     * 
     * @param id 积分兑换ID
     * @return 结果
     */
    @Override
    public int deleteScoreRecordById(Long id)
    {
        return scoreRecordMapper.deleteScoreRecordById(id);
    }

    @Override
    public ScoreRecord selectScoreRecordByUserName(String username) {
        return scoreRecordMapper.selectScoreRecordByUserName(username);
    }
}
