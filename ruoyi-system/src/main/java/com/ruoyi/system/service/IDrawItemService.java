package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DrawItem;

/**
 * 物品Service接口
 * 
 * @author ruoyi
 * @date 2020-12-03
 */
public interface IDrawItemService 
{
    /**
     * 查询物品
     * 
     * @param id 物品ID
     * @return 物品
     */
    public DrawItem selectDrawItemById(Long id);

    /**
     * 查询物品列表
     * 
     * @param drawItem 物品
     * @return 物品集合
     */
    public List<DrawItem> selectDrawItemList(DrawItem drawItem);

    /**
     * 新增物品
     * 
     * @param drawItem 物品
     * @return 结果
     */
    public int insertDrawItem(DrawItem drawItem);

    /**
     * 修改物品
     * 
     * @param drawItem 物品
     * @return 结果
     */
    public int updateDrawItem(DrawItem drawItem);

    /**
     * 批量删除物品
     * 
     * @param ids 需要删除的物品ID
     * @return 结果
     */
    public int deleteDrawItemByIds(Long[] ids);

    /**
     * 删除物品信息
     * 
     * @param id 物品ID
     * @return 结果
     */
    public int deleteDrawItemById(Long id);
}
