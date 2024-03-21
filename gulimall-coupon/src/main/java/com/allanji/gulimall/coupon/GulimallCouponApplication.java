package com.allanji.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 使用Nacos作为配置中心统一管理配置
 *   1) 引入依赖，spring-cloud-starter-alibaba-nacos-config
 *   2) 创建一个bootstrap.properties
 *     i. 配置Nacos的地址，application的名字
 *   3) 给配置中心添加一个配置，dataid（数据集）：应用名.properties
 *   4) 添加任何配置
 *   5) 动态获取配置。
 *     i. 使用@RefreshScope注解动态获取并刷新配置
 *     ii. @Value("${配置项的名}")，获取配置
 *     * 如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
