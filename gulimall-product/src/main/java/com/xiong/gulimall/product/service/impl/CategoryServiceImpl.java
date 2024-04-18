package com.xiong.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.common.utils.PageUtils;
import com.xiong.common.utils.Query;

import com.xiong.gulimall.product.dao.CategoryDao;
import com.xiong.gulimall.product.entity.CategoryEntity;
import com.xiong.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
//        完全版
//        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) -> {
//            return categoryEntity.getParentCid() == 0;
//        }).collect(Collectors.toList());
//        简单版
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity->
             categoryEntity.getParentCid() == 0).map((menu)->{
                 menu.setChildren(getChildrens(menu,entities));
                 return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public List<CategoryEntity> listWithTree1() {
        CategoryEntity c= baseMapper.selectById(34);


        List<CategoryEntity> all = baseMapper.selectList(null);
        List<CategoryEntity> childrens = getChildrens(c, all);
        return childrens;
    }
    @Override
    public void removeMenuByIds(List<Long> asList) {
    //TODO 1.检查当前删除的菜单，是否被别的地方引用
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public List<CategoryEntity> all() {
        List<CategoryEntity> entities = baseMapper.selectList(null);

        return entities;
    }

    //    改过查找所有菜单的子菜单
    private   List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
                     return categoryEntity.getParentCid() == root.getCatId();
        }
        ).map(categoryEntity->{
//            找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
//            菜单的排序
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}