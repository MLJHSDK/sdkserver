package com.sdkserver.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Hystrix_StartSDKApp {
    public static void main(String[] args)
    {
        SpringApplication.run(Hystrix_StartSDKApp.class, args);
    }
}
