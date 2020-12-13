package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ScoreRecord;

/**
 * 积分兑换Service接口
 * 
 * @author lcb
 * @date 2020-12-07
 */
public interface IScoreRecordService 
{
    /**
     * 查询积分兑换
     * 
     * @param id 积分兑换ID
     * @return 积分兑换
     */
    public ScoreRecord selectScoreRecordById(Long id);

    /**
     * 查询积分兑换列表
     * 
     * @param scoreRecord 积分兑换
     * @return 积分兑换集合
     */
    public List<ScoreRecord> selectScoreRecordList(ScoreRecord scoreRecord);

    /**
     * 新增积分兑换
     * 
     * @param scoreRecord 积分兑换
     * @return 结果
     */
    public int insertScoreRecord(ScoreRecord scoreRecord);

    /**
     * 修改积分兑换
     * 
     * @param scoreRecord 积分兑换
     * @return 结果
     */
    public int updateScoreRecord(ScoreRecord scoreRecord);

    /**
     * 批量删除积分兑换
     * 
     * @param ids 需要删除的积分兑换ID
     * @return 结果
     */
    public int deleteScoreRecordByIds(Long[] ids);

    /**
     * 删除积分兑换信息
     * 
     * @param id 积分兑换ID
     * @return 结果
     */
    public int deleteScoreRecordById(Long id);

    ScoreRecord selectScoreRecordByUserName(String username);
}
