package com.xiong.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-26 13:48:43
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

