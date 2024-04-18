package com.xiong.gulimall.ware;

import com.xiong.gulimall.ware.entity.WareInfoEntity;
import com.xiong.gulimall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {
    @Autowired
    WareInfoService wareInfoService;
    @Test
    void contextLoads() {
        WareInfoEntity byId = wareInfoService.getById(1);
        System.out.println("byId = " + byId);
    }

}
