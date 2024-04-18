package com.xiong.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-25 18:49:37
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

