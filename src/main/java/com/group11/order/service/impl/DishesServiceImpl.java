package com.group11.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group11.order.domain.Dishes;
import com.group11.order.mapper.DishesMapper;
import com.group11.order.service.DishesService;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【dishes】的数据库操作Service实现
* @createDate 2023-11-06 08:08:15
*/
@Service
public class DishesServiceImpl extends ServiceImpl<DishesMapper, Dishes>
    implements DishesService{

}




