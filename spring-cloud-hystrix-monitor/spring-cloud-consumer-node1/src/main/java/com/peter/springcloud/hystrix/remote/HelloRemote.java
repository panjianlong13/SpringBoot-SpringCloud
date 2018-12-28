package com.peter.springcloud.hystrix.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloRemote
 * @Description: TODO
 * @author Peter Pan
 * @date 2018年12月28日
 *
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name") String name);

}
