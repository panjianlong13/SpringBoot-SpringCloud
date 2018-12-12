package com.peter.springboot.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.peter.springboot.dubbo.consumer.run.Startup;
import com.peter.springboot.dubbo.consumer.service.ConsumerDemoService;

/**
 * @ClassName: ConsumerTest
 * @Description: 测试消费远程服务
 * @author Peter Pan
 * @date 2018年12月12日
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
public class ConsumerTest {

	@Autowired
	private ConsumerDemoService consumerDemoService;

	@Test
	public void sayHello() {
		consumerDemoService.sayHello("Peter Pan");
	}
}
