package com.iat.bytemall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient()
@SpringBootApplication
public class BytemallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BytemallGatewayApplication.class, args);
	}

}
