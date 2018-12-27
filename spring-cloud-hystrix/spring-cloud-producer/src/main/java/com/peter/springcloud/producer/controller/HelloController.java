package com.peter.springcloud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月27日
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello " + name + "! Sending Message action success";
	}
}