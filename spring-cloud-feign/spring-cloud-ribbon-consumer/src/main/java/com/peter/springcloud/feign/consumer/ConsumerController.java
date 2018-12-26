package com.peter.springcloud.feign.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConsumerController
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月21日
 *
 */
@RestController
public class ConsumerController {

	@Autowired
    private FeignConsumeClient feignConsumeClient;

	@GetMapping(value = "/hello")
	public String hello() {
		return feignConsumeClient.consumer();
	}

}
