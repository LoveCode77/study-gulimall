package com.xiong.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-26 18:20:48
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

