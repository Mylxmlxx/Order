package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.UserOrderRelations;
import com.group11.order.service.UserOrderRelationsService;
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
@RequestMapping("/userOrderRelations")
public class UserOrderRelationsController {
    @Resource
    UserOrderRelationsService userOrderRelationsService;

    /**
     * 查询所有userOrderRelations
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<UserOrderRelations>> all() {
        return ResultUtils.success(userOrderRelationsService.list());
    }

    /**
     * 根据id查询userOrderRelations
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(userOrderRelationsService.removeById(id));
    }

    /**
     * 更新userOrderRelations
     *
     * @param userOrderRelations
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(UserOrderRelations userOrderRelations) {
        return ResultUtils.success(userOrderRelationsService.updateById(userOrderRelations));
    }

    /**
     * 添加userOrderRelations
     *
     * @param userOrderRelations
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(@RequestBody UserOrderRelations userOrderRelations) {
        return ResultUtils.success(userOrderRelationsService.save(userOrderRelations));
    }
}
