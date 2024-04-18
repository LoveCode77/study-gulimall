package com.xiong.gulimall.member;

import com.xiong.gulimall.member.entity.MemberEntity;
import com.xiong.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {
    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity byId = memberService.getById(1);
        System.out.println("byId = " + byId);
    }

}
