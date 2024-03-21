package com.allanji.gulimall.member.dao;

import com.allanji.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:22:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
