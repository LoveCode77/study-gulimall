package com.xiong.gulimall.coupon;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.xiong.gulimall.coupon.entity.CouponEntity;
import com.xiong.gulimall.coupon.entity.MemberPriceEntity;
import com.xiong.gulimall.coupon.service.CouponService;
import com.xiong.gulimall.coupon.service.MemberPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class GulimallCouponApplicationTests {
    @Autowired
    MemberPriceService memberPriceService;
    @Test
    void contextLoads() {
        Map<String,Object> map=new HashMap<>();
        map.put("id",2);
        List<MemberPriceEntity> memberPriceEntities = memberPriceService.listByMap(map);
        memberPriceEntities.forEach((item)->{
            System.out.println(item);
        });
    }

}
