package com.cht.rdp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Sets;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

	  @Bean
	    public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .produces(Sets.newHashSet("application/json"))
	                .consumes(Sets.newHashSet("application/json"))
	                .protocols(Sets.newHashSet("http", "https"))
	                .apiInfo(apiInfo())
	                .forCodeGeneration(true)
	                .useDefaultResponseMessages(false)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.cht.rdp.controller")) // 指定 controller 存放的目陸路徑
	                .paths(PathSelectors.any())
	                .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("[CCBS2.0] Word-Splits RES API Services") // 標題
	                .description("基於 Ansj 的中文分詞工具") // 描述
	                .version("v0.1")
	                .license("")
	                .licenseUrl("")
	                .build();
	    }

}