package com.iat.bytemall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.iat.bytemall.member.feign")
@EnableDiscoveryClient()
//@MapperScan("com.iat.bytemall.member.dao")
@SpringBootApplication
public class BytemallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BytemallMemberApplication.class, args);
	}

}
