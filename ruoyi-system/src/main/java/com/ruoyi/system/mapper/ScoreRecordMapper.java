package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ScoreRecord;

/**
 * 积分兑换Mapper接口
 * 
 * @author lcb
 * @date 2020-12-07
 */
public interface ScoreRecordMapper 
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
     * 删除积分兑换
     * 
     * @param id 积分兑换ID
     * @return 结果
     */
    public int deleteScoreRecordById(Long id);

    /**
     * 批量删除积分兑换
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteScoreRecordByIds(Long[] ids);

    ScoreRecord selectScoreRecordByUserName(String username);
}
