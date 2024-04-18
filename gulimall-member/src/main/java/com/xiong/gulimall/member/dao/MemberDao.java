package com.xiong.gulimall.member.dao;

import com.xiong.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xd
 * @email 1822649761@qq.com
 * @date 2021-05-26 14:20:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
