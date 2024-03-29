package com.allanji.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合Mybatis-Plus
 * 1、导入依赖
 *     <dependency>
 *         <groupId>com.baomidou</groupId>
 *         <artifactId>mybatis-plus-boot-starter</artifactId>
 *         <version>3.2.0</version>
 *     </dependency>
 * 2、配置
 *    1) 配置数据源
 *      1. 导入数据库驱动
 *      2. 在application.yml配置数据源
 *    2) 配置Mybatis-Plus
 *      1. 使用@MapperScan
 *      2. sql映射文件位置
 *
 */
@MapperScan("com.allanji.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
