package com.iat.bytemall.product;

/**
 * @description:
 * @author: Desmand
 * @time: 2021/3/13 10:53 上午
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.iat.bytemall.product.dao")
@SpringBootApplication
public class BytemallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(BytemallProductApplication.class, args);
    }

}
