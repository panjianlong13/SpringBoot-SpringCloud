package com.peter.springboot.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 描述: 接收者
 *
 * @author: yanpenglei
 * @create: 2017/10/23 14:15
 */
@Component
@RabbitListener(queues = "topic.peter")
public class TopicReceiver3 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收者 TopicReceiver3," + message);
    }

}
