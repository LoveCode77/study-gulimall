package com.xiong.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.common.utils.PageUtils;
import com.xiong.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-26 14:20:20
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

