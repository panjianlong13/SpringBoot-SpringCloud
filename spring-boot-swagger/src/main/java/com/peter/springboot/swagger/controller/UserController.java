package com.peter.springboot.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@RequestMapping(value = "/user", method = { RequestMethod.GET })
	public String getProductInfo() {
		return "Peter";
	}
}
