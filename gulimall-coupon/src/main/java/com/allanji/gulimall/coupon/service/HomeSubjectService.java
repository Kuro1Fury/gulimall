package com.allanji.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allanji.common.utils.PageUtils;
import com.allanji.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-20 19:12:26
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

