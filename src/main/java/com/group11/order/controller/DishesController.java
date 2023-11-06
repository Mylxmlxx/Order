package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.Dishes;
import com.group11.order.service.DishesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yzy
 * @version 1.0
 * @description TODO
 * @date 2023/11/6 8:22
 */
@RestController()
@RequestMapping("/dishes")
public class DishesController {
    @Resource
    DishesService dishesService;

    /**
     * 查询所有dishes
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<Dishes>> all() {
        return ResultUtils.success(dishesService.list());
    }

    /**
     * 根据id查询dishes
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(dishesService.removeById(id));
    }

    /**
     * 更新dishes
     *
     * @param dishes
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(Dishes dishes) {
        return ResultUtils.success(dishesService.updateById(dishes));
    }

    /**
     * 添加dishes
     *
     * @param dishes
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(Dishes dishes) {
        return ResultUtils.success(dishesService.save(dishes));
    }
}
