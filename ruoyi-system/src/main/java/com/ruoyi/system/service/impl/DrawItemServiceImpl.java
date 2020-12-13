package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DrawItemMapper;
import com.ruoyi.system.domain.DrawItem;
import com.ruoyi.system.service.IDrawItemService;

/**
 * 物品Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-03
 */
@Service
public class DrawItemServiceImpl implements IDrawItemService 
{
    @Autowired
    private DrawItemMapper drawItemMapper;

    /**
     * 查询物品
     * 
     * @param id 物品ID
     * @return 物品
     */
    @Override
    public DrawItem selectDrawItemById(Long id)
    {
        return drawItemMapper.selectDrawItemById(id);
    }

    /**
     * 查询物品列表
     * 
     * @param drawItem 物品
     * @return 物品
     */
    @Override
    public List<DrawItem> selectDrawItemList(DrawItem drawItem)
    {
        return drawItemMapper.selectDrawItemList(drawItem);
    }

    /**
     * 新增物品
     * 
     * @param drawItem 物品
     * @return 结果
     */
    @Override
    public int insertDrawItem(DrawItem drawItem)
    {
        drawItem.setCreateTime(DateUtils.getNowDate());
        return drawItemMapper.insertDrawItem(drawItem);
    }

    /**
     * 修改物品
     * 
     * @param drawItem 物品
     * @return 结果
     */
    @Override
    public int updateDrawItem(DrawItem drawItem)
    {
        drawItem.setUpdateTime(DateUtils.getNowDate());
        return drawItemMapper.updateDrawItem(drawItem);
    }

    /**
     * 批量删除物品
     * 
     * @param ids 需要删除的物品ID
     * @return 结果
     */
    @Override
    public int deleteDrawItemByIds(Long[] ids)
    {
        return drawItemMapper.deleteDrawItemByIds(ids);
    }

    /**
     * 删除物品信息
     * 
     * @param id 物品ID
     * @return 结果
     */
    @Override
    public int deleteDrawItemById(Long id)
    {
        return drawItemMapper.deleteDrawItemById(id);
    }
}
