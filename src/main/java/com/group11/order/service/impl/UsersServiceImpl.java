package com.group11.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group11.order.domain.Users;
import com.group11.order.service.UsersService;
import com.group11.order.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【users】的数据库操作Service实现
* @createDate 2023-11-06 08:08:15
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




