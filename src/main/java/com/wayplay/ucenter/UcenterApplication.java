package com.wayplay.ucenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.wayplay.ucenter.dao")
public class UcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcenterApplication.class, args);
	}
}
