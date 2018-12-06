package com.peter.springboot.kafka.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.peter.springboot.kafka.MsgProducer;
import com.peter.springboot.kafka.run.Startup;

/**
 * @ClassName: BaseTest
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月6日
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
public class BaseTest {

	@Autowired
	private MsgProducer msgProducer;

	@Test
	public void test() throws Exception {

		msgProducer.sendMessage("topic-1", "topic--------1");
		msgProducer.sendMessage("topic-2", "topic--------2");
	}
}
