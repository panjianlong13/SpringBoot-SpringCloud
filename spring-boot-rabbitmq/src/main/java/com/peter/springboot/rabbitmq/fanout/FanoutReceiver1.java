package com.peter.springboot.rabbitmq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 描述:接收者
 *
 * @author yanpenglei
 * @create 2017-10-23 15:38
 **/
@Component
@RabbitListener(queues = "https://blog.csdn.net/panjianlongWUHAN")
public class FanoutReceiver1 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收者 FanoutReceiver1," + message);
    }
}
