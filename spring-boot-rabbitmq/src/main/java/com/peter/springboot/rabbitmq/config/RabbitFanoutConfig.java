package com.peter.springboot.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:配置广播模式或者订阅模式队列
 * <p>
 * Fanout 就是我们熟悉的广播模式或者订阅模式，给Fanout交换机发送消息，绑定了这个交换机的所有队列都收到这个消息。
 *
 * @author Peter Pan
 * @create 2018-12-05 0:09
 **/
@Configuration
public class RabbitFanoutConfig {

    final static String PETER_BLOG = "https://blog.csdn.net/panjianlongWUHAN";

    final static String PETER_GIT = "https://github.com/panjianlong13/SpringBoot-SpringCloud";
    @Bean
    public Queue queuePenglei() {
        return new Queue(RabbitFanoutConfig.PETER_BLOG);
    }

    @Bean
    public Queue queueSouyunku() {
        return new Queue(RabbitFanoutConfig.PETER_GIT);
    }

    /**
     * 任何发送到Fanout Exchange的消息都会被转发到与该Exchange绑定(Binding)的所有队列上。
     */
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeQueuePenglei(Queue queuePenglei, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queuePenglei).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeQueueSouyunku(Queue queueSouyunku, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueSouyunku).to(fanoutExchange);
    }

}
