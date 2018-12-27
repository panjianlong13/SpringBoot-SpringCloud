package com.peter.springcloud.hystrix.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @ClassName: HelloRemoteHystrix
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月27日
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "hello " + name + "! Sending Message action failed ";
	}
}
