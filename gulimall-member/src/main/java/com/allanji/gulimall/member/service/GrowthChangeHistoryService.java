package com.allanji.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allanji.common.utils.PageUtils;
import com.allanji.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:22:50
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

