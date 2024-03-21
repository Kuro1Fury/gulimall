package com.allanji.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allanji.common.utils.PageUtils;
import com.allanji.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:12:26
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

