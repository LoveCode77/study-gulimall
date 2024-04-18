package com.xiong.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-25 18:49:37
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

