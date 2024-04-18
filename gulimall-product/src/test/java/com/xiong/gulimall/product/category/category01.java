package com.xiong.gulimall.product.category;

import com.xiong.gulimall.product.entity.CategoryEntity;
import com.xiong.gulimall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class category01 {
    @Autowired
    private CategoryService categoryService;
    
    @Test
    public void test01() {
        List<CategoryEntity> categoryEntities = categoryService.listWithTree();
        System.out.println("categoryEntities = " + categoryEntities);

    }
    @Test
    public void test02() {
//        List<CategoryEntity> all = categoryService.all();
//        System.out.println("all = " + all);
        List<CategoryEntity> categoryEntities = categoryService.listWithTree1();
        System.out.println("categoryEntities = " + categoryEntities);
    }
}
