package com.peter.springboot.lucene.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: Startup
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月13日
 *
 */
@SpringBootApplication
@ComponentScan(value = { "com.peter.springboot.lucene" })
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}
