package com.peter.springboot.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MsgConsumer
 * @Description: 消息消费者
 * @author Peter Pan
 * @date 2018年12月6日
 *
 */
@Component
public class MsgConsumer {

	@KafkaListener(topics = { "topic-1", "topic-2" })
	public void processMessage(String content) {

		System.out.println("消息被消费" + content);
	}

}