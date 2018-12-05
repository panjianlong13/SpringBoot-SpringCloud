package com.peter.springboot.rabbitmq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.peter.springboot.rabbitmq.run.Startup;

/**
 * 描述: 广播模式或者订阅模式队列
 *
 * @author Peter Pan
 * @create 2018-12-05 0:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
public class RabbitFanoutTest {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Test
    public void sendPengleiTest() {

        String context = "此消息在，广播模式或者订阅模式队列下，有 FanoutReceiver1 FanoutReceiver2 可以收到";

        String routeKey = "https://blog.csdn.net/panjianlongWUHAN";

        String exchange = "fanoutExchange";

        System.out.println("sendPengleiTest : " + context);

        context = "context:" + exchange + ",routeKey:" + routeKey + ",context:" + context;

        this.rabbitTemplate.convertAndSend(exchange, routeKey, context);
    }

    @Test
    public void sendSouyunkuTest() {

        String context = "此消息在，广播模式或者订阅模式队列下，有 FanoutReceiver1 FanoutReceiver2 可以收到";

        String routeKey = "https://github.com/panjianlong13/SpringBoot-SpringCloud";

        String exchange = "fanoutExchange";

        context = "context:" + exchange + ",routeKey:" + routeKey + ",context:" + context;

        System.out.println("sendSouyunkuTest : " + context);

        this.rabbitTemplate.convertAndSend(exchange, routeKey, context);
    }
}
