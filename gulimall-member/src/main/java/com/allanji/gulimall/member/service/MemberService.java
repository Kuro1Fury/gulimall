package com.allanji.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allanji.common.utils.PageUtils;
import com.allanji.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:22:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

