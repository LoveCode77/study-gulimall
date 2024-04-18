package com.xiong.gulimall.order;

import com.xiong.gulimall.order.entity.OrderEntity;
import com.xiong.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {
    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity byId = orderService.getById(1);
        System.out.println("byId = " + byId);
    }

}
