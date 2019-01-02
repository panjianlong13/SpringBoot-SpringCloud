package com.peter.springcloud.feign.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: FeignConsumeClient
 * @Description: 指定这个接口所要调用的 提供者服务名称 "eureka-provider"
 * @author Peter Pan
 * @date 2018年12月26日
 *
 */
@FeignClient("eureka-provider")
public interface FeignConsumeClient {

	@GetMapping("/")
	String consumer();
}
