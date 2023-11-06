package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.Orders;
import com.group11.order.service.OrdersService;
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
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    OrdersService ordersService;

    /**
     * 查询所有orders
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<Orders>> all() {
        return ResultUtils.success(ordersService.list());
    }

    /**
     * 根据id查询orders
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(ordersService.removeById(id));
    }

    /**
     * 更新orders
     *
     * @param orders
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(Orders orders) {
        return ResultUtils.success(ordersService.updateById(orders));
    }

    /**
     * 添加orders
     *
     * @param orders
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(Orders orders) {
        return ResultUtils.success(ordersService.save(orders));
    }
}
