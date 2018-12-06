package com.peter.springboot.kafka.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: Startup
 * @Description: 启动服务
 * @author Peter Pan
 * @date 2018年12月6日
 *
 */
@SpringBootApplication
@ComponentScan(value = { "com.peter.springboot.kafka" })
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}
