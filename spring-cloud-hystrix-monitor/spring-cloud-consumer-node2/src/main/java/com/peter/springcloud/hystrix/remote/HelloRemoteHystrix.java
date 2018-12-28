package com.peter.springcloud.hystrix.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.peter.springcloud.hystrix.remote.HelloRemote;

/**
 * @ClassName: HelloRemoteHystrix
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月28日
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello2(@RequestParam(value = "name") String name) {
		return "hello " + name + ", this messge send failed ";
	}
}
