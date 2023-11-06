package com.group11.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group11.order.domain.UserOrderRelations;
import com.group11.order.service.UserOrderRelationsService;
import com.group11.order.mapper.UserOrderRelationsMapper;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【user_order_relations】的数据库操作Service实现
* @createDate 2023-11-06 08:08:15
*/
@Service
public class UserOrderRelationsServiceImpl extends ServiceImpl<UserOrderRelationsMapper, UserOrderRelations>
    implements UserOrderRelationsService{

}




