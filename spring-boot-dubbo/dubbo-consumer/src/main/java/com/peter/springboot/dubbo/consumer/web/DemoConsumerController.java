package com.peter.springboot.dubbo.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.peter.springboot.dubbo.api.DemoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: DemoConsumerController
 * @Description: Consumer控制器
 * @author Peter Pan
 * @date 2018年12月12日
 *
 */
@RestController
public class DemoConsumerController {

	@Resource
	private DemoService demoService;

	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return demoService.sayHello(name);
	}
}