package com.sdkserver.game.config;

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
 * @ClassName Swagger
 * @Description
 * @Author ericchan
 * @Date 2018/5/25 下午5:11
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

    
    
//    @Bean
////    public Docket createRestApiForeground() {
////        return new Docket(DocumentationType.SWAGGER_2)
////        		.groupName("前台")
////                .apiInfo(apiInfo())
////                .select()
////                .apis(RequestHandlerSelectors.basePackage("org.management.controller"))
////                .paths(PathSelectors.any())
////                .build();
////    }
    
    @Bean
    public Docket createRestApiBackground() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("后台")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sdkserver.game.controller"))
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
