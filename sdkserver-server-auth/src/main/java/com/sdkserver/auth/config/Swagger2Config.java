package com.sdkserver.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName Swagger配置类
 * @Description Swagger注册进springboot
 * @Author zwJ
 * @Date 2018/9/25 下午15:14
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApiBackground() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("后台")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sdkserver.channel.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("秒乐聚合SDK项目游戏服务api文档")
                .description(" 注意：入参出参在'Data Type'-->'Model'处有详细备注")
                .license(" 开发小组：后台：陈泽伟、曾文杰")
                .termsOfServiceUrl("/swagger-ui.html")
                .version("1.0")
                .build();
    }
    


}
