package com.peter.springboot.rabbitmq.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 描述: 启动服务
 *
 * @author Peter Pan
 * @create 2018-12-05 0:09
 */
@SpringBootApplication
@ComponentScan(value = {"com.peter.springboot.rabbitmq"})
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}
