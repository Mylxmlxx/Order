package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.DishInventory;
import com.group11.order.service.DishInventoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yzy
 * @version 1.0
 * @description TODO
 * @date 2023/11/6 8:22
 */
@Controller("/dishInventory")
public class DishInventoryController {
    @Resource
    DishInventoryService dishInventoryService;

    /**
     * 查询所有dishInventory
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<DishInventory>> all() {
        return ResultUtils.success(dishInventoryService.list());
    }

    /**
     * 根据id查询dishInventory
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(dishInventoryService.removeById(id));
    }

    /**
     * 更新dishInventory
     *
     * @param dishInventory
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(DishInventory dishInventory) {
        return ResultUtils.success(dishInventoryService.updateById(dishInventory));
    }

    /**
     * 添加dishInventory
     *
     * @param dishInventory
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(DishInventory dishInventory) {
        return ResultUtils.success(dishInventoryService.save(dishInventory));
    }
}
