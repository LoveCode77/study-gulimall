package com.xiong.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-26 14:43:21
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

