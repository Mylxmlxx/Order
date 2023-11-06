package com.group11.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group11.order.domain.Orders;
import com.group11.order.mapper.OrdersMapper;
import com.group11.order.service.OrdersService;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【orders】的数据库操作Service实现
* @createDate 2023-11-06 08:08:15
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




