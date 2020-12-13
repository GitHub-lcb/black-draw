package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 积分兑换对象 score_record
 * 
 * @author lcb
 * @date 2020-12-07
 */
public class ScoreRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 兑换物品 */
    @Excel(name = "兑换物品")
    private String goods;

    /** 积分总数量 */
    private Long scoreTotal;

    /** 积分剩余数量 */
    @Excel(name = "积分剩余数量")
    private Long scoreRemain;

    /** 消耗积分 */
    @Excel(name = "消耗积分")
    private Long scoreCost;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGoods(String goods) 
    {
        this.goods = goods;
    }

    public String getGoods() 
    {
        return goods;
    }
    public void setScoreTotal(Long scoreTotal) 
    {
        this.scoreTotal = scoreTotal;
    }

    public Long getScoreTotal() 
    {
        return scoreTotal;
    }
    public void setScoreRemain(Long scoreRemain) 
    {
        this.scoreRemain = scoreRemain;
    }

    public Long getScoreRemain() 
    {
        return scoreRemain;
    }
    public void setScoreCost(Long scoreCost) 
    {
        this.scoreCost = scoreCost;
    }

    public Long getScoreCost() 
    {
        return scoreCost;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goods", getGoods())
            .append("scoreTotal", getScoreTotal())
            .append("scoreRemain", getScoreRemain())
            .append("scoreCost", getScoreCost())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
