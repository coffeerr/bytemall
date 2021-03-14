package com.iat.bytemall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.iat.bytemall.order.dao")
@SpringBootApplication
public class BytemallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BytemallOrderApplication.class, args);
	}

}
