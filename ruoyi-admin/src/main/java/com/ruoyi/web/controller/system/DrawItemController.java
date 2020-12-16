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
import com.ruoyi.system.domain.DrawItem;
import com.ruoyi.system.service.IDrawItemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物品Controller
 * 
 * @author ruoyi
 * @date 2020-12-03
 */
@RestController
@RequestMapping("/system/item")
public class DrawItemController extends BaseController
{
    @Autowired
    private IDrawItemService drawItemService;

    /**
     * 查询物品列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(DrawItem drawItem)
    {
        startPage();
        List<DrawItem> list = drawItemService.selectDrawItemList(drawItem);
        return getDataTable(list);
    }

    /**
     * 导出物品列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:export')")
    @Log(title = "物品", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DrawItem drawItem)
    {
        List<DrawItem> list = drawItemService.selectDrawItemList(drawItem);
        ExcelUtil<DrawItem> util = new ExcelUtil<DrawItem>(DrawItem.class);
        return util.exportExcel(list, "item");
    }

    /**
     * 获取物品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:item:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(drawItemService.selectDrawItemById(id));
    }

    /**
     * 新增物品
     */
    @PreAuthorize("@ss.hasPermi('system:item:add')")
    @Log(title = "物品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DrawItem drawItem)
    {
        drawItem.setIcon("http://fuli.xiaoheigame.com/img/bean_500.png");
        return toAjax(drawItemService.insertDrawItem(drawItem));
    }

    /**
     * 修改物品
     */
    @PreAuthorize("@ss.hasPermi('system:item:edit')")
    @Log(title = "物品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DrawItem drawItem)
    {
        return toAjax(drawItemService.updateDrawItem(drawItem));
    }

    /**
     * 删除物品
     */
    @PreAuthorize("@ss.hasPermi('system:item:remove')")
    @Log(title = "物品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(drawItemService.deleteDrawItemByIds(ids));
    }
}
