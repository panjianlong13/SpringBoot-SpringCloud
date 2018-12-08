package com.peter.springboot.swagger;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: Startup
 * @Description: 启动服务
 * @author Peter Pan
 * @date 2018年12月6日
 *
 */
@EnableSwagger2
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.peter.springboot"))              
          .paths(PathSelectors.any())            //PathSelectors.ant("/api/*")               
          .build()
          .apiInfo(apiInfo());                                           
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "Swagger API Service", 
          "Swagger API", 
          "v1.0", 
          "", 
          new Contact("Jian Long Pan", "www.csdn.net", "https://me.csdn.net/panjianlongWUHAN"), 
          "License of API", "API license URL", Collections.emptyList());
   }
}
