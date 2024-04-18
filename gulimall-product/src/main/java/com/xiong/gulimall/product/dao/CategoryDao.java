package com.xiong.gulimall.product.dao;

import com.xiong.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-25 18:49:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
