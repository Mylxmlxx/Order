package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.TableOrderRelations;
import com.group11.order.service.TableOrderRelationsService;
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
@RequestMapping("/tableOrderRelations")
public class TableOrderRelationsController {
    @Resource
    TableOrderRelationsService tableOrderRelationsService;

    /**
     * 查询所有tableOrderRelations
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<TableOrderRelations>> all() {
        return ResultUtils.success(tableOrderRelationsService.list());
    }

    /**
     * 根据id查询tableOrderRelations
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(tableOrderRelationsService.removeById(id));
    }

    /**
     * 更新tableOrderRelations
     *
     * @param tableOrderRelations
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(TableOrderRelations tableOrderRelations) {
        return ResultUtils.success(tableOrderRelationsService.updateById(tableOrderRelations));
    }

    /**
     * 添加tableOrderRelations
     *
     * @param tableOrderRelations
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(@RequestBody TableOrderRelations tableOrderRelations) {
        return ResultUtils.success(tableOrderRelationsService.save(tableOrderRelations));
    }
}
