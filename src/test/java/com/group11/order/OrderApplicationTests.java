package com.group11.order;

import com.group11.order.domain.Dishes;
import com.group11.order.domain.Users;
import com.group11.order.service.DishesService;
import com.group11.order.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class OrderApplicationTests {

    @Resource
    private UsersService usersService;
    @Resource
    private DishesService dishesService;

    @Test
    void contextLoads() {
        List<Users> list = usersService.list();
        for (Users users : list) {
            System.out.println(users);
        }
    }

    @Test
    void testInsert() {
        Dishes dishes = new Dishes();
        dishes.setDishName("鱼香肉丝");
        dishesService.save(dishes);
    }

}
