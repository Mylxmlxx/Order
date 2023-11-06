package com.group11.order;

import com.group11.order.domain.Users;
import com.group11.order.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class OrderApplicationTests {

    @Resource
    private UsersService usersService;
    @Test
    void contextLoads() {
        List<Users> list = usersService.list();
        for (Users users : list) {
            System.out.println(users);
        }
    }

}
