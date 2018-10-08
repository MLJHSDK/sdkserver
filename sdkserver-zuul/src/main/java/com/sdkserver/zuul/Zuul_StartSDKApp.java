package com.sdkserver.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_StartSDKApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_StartSDKApp.class);
    }
}
