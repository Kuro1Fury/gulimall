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
 *
 * 2. 细节
 *   1) 命名空间 - 配置隔离
 *     默认：public(保留空间)；默认新增的所有配置都在public空间
 *     i. 1) 开发，2) 测试，3) 生产 - 利用命名空间来做环境隔离
 *        * 在bootstrap.properties配置上，需要使用哪个命名空间，且是uuid
 *     ii. 每个微服务之间相互隔离配置，创建各自的命名空间，只加载自己命名空间的配置
 *   2) 配置集 - 一组相关或不相关的配置项的集合（所有配置的集合）
 *   3) 配置集ID - 类似文件名
 *     Data ID：配置文件名
 *   4) 配置分组
 *     默认所有配置集都属于DEFAULT_GROUP，可以根据业务随意定义分组
 *
 * 本项目：每个微服务创建自己的命名空间，使用配置分组区分环境
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
