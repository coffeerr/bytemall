package com.iat.bytemall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.iat.bytemall.ware.dao")
@SpringBootApplication
public class BytemallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(BytemallWareApplication.class, args);
	}

}
