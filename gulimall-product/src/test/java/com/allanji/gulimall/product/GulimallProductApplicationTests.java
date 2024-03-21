package com.allanji.gulimall.product;

import com.allanji.gulimall.product.entity.BrandEntity;
import com.allanji.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        // 新建一个品牌对象
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("三星");
//        brandService.save(brandEntity);
//        System.out.println("保存成功...");

        // 修改一个品牌对象
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("华为");
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);

        // 查询一个品牌对象
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });


    }

}
