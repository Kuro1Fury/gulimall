package com.allanji.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allanji.common.utils.PageUtils;
import com.allanji.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:38:56
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

