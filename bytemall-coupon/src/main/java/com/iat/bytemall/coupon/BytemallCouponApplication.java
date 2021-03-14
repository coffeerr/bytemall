package com.iat.bytemall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.iat.bytemall.coupon.dao")
@SpringBootApplication
public class BytemallCouponApplication {

    public static void main(String[] args) {

        SpringApplication.run(BytemallCouponApplication.class, args);
    }


}
