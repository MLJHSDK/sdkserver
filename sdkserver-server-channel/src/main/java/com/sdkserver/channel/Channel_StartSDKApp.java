package com.sdkserver.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现
//@EnableFeignClients(basePackages={"com.sdkserver.channel.service"})//进行接口IDeptClientService的扫描生成使得可以注入到ConsumerDeptController里面
@EnableTransactionManagement
@EnableCaching
public class Channel_StartSDKApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(Channel_StartSDKApp.class, args);
	}
}
