package com.group11.order.controller;

import com.group11.order.common.BaseResponse;
import com.group11.order.common.ResultUtils;
import com.group11.order.domain.Tables;
import com.group11.order.service.TablesService;
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
@RequestMapping("/tables")
public class TablesController {
    @Resource
    TablesService tablesService;

    /**
     * 查询所有tables
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse<List<Tables>> all() {
        return ResultUtils.success(tablesService.list());
    }

    /**
     * 根据id查询tables
     *
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public BaseResponse<Boolean> delete(@PathVariable("id") Integer id) {
        return ResultUtils.success(tablesService.removeById(id));
    }

    /**
     * 更新tables
     *
     * @param tables
     * @return
     */
    @PostMapping("/update")
    public BaseResponse<Boolean> update(Tables tables) {
        return ResultUtils.success(tablesService.updateById(tables));
    }

    /**
     * 添加tables
     *
     * @param tables
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> add(Tables tables) {
        return ResultUtils.success(tablesService.save(tables));
    }
}
