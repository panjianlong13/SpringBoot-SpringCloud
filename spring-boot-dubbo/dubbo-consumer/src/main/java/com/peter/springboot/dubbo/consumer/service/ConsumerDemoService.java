package com.peter.springboot.dubbo.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peter.springboot.dubbo.api.DemoService;

/**
 * @ClassName: ConsumerDemoService
 * @Description: 消费远程方法
 * @author Peter Pan
 * @date 2018年12月12日
 *
 */
@Service("consumerDemoService")
public class ConsumerDemoService {

	@Autowired
	private DemoService demoService;

	public void sayHello(String name) {
		String hello = demoService.sayHello(name); // 执行消费远程方法
		System.out.println(hello); // 显示调用结果
	}

}
