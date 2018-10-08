package com.sdkserver.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdkserver.management.mapper")
public class Management_StartSDKApp {

	public static void main(String[] args) {
		SpringApplication.run(Management_StartSDKApp.class, args);
	}
}
