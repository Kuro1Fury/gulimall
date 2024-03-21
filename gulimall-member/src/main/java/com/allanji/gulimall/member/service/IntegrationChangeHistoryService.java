package com.allanji.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allanji.common.utils.PageUtils;
import com.allanji.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:22:50
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

