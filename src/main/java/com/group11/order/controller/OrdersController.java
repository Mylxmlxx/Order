package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.Orders;
import com.group11.order.service.OrdersService;
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
@Controller("/users")
public class OrdersController {
    @Resource
    OrdersService usersService;

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<Orders>> all() {
        return ResultUtils.success(usersService.list());
    }

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(usersService.removeById(id));
    }

    /**
     * 更新用户
     *
     * @param users
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(Orders users) {
        return ResultUtils.success(usersService.updateById(users));
    }

    /**
     * 添加用户
     *
     * @param users
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(Orders users) {
        return ResultUtils.success(usersService.save(users));
    }
}
