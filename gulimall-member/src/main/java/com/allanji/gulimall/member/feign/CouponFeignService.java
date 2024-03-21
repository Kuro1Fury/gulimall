package com.allanji.gulimall.member.feign;

import com.allanji.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon") // 远程调用的服务名(nacos中注册的服务名)，表明这是一个声明式的远程调用
public interface CouponFeignService {
    
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
