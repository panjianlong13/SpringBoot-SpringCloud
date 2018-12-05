package com.peter.springboot.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 描述: 接收者
 *
 * @author Peter Pan
 * @create 2018-12-05 0:09
 */
@Component
@RabbitListener(queues = "topic.message.s")
public class TopicReceiver2 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收者 TopicReceiver2," + message);
    }

}
