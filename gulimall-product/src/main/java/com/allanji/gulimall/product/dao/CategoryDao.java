package com.allanji.gulimall.product.dao;

import com.allanji.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author allanji
 * @email skycoder@gmail.com
 * @date 2024-03-18 18:49:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
