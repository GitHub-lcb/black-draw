package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物品对象 draw_item
 * 
 * @author ruoyi
 * @date 2020-12-03
 */
public class DrawItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String icon;

    /** 物品名 */
    @Excel(name = "物品名")
    private String name;

    /** 物品编号 */
    @Excel(name = "物品编号")
    private Long num;

    /** 概率 */
    @Excel(name = "概率")
    private Double rate;

    /** 是否中奖 */
    @Excel(name = "是否中奖")
    private Integer isPrize;

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
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }
    public void setRate(Double rate) 
    {
        this.rate = rate;
    }

    public Double getRate() 
    {
        return rate;
    }
    public void setIsPrize(Integer isPrize) 
    {
        this.isPrize = isPrize;
    }

    public Integer getIsPrize() 
    {
        return isPrize;
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
            .append("icon", getIcon())
            .append("name", getName())
            .append("num", getNum())
            .append("rate", getRate())
            .append("isPrize", getIsPrize())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
