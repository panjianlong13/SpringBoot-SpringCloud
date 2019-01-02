package com.peter.springcloud.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {

//    @LoadBalanced
//    @Bean
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
}
