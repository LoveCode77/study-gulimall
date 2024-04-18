package com.xiong.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-25 18:49:37
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
    List<CategoryEntity> listWithTree1();

    void removeMenuByIds(List<Long> asList);

    List<CategoryEntity> all();


}

