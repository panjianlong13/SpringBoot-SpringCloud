package com.peter.springboot.dubbo.provider.service;

import com.alibaba.dubbo.rpc.RpcContext;
import com.peter.springboot.dubbo.api.DemoService;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DemoServiceImpl
 * @Description: 提供方法实现
 * @author Peter Pan
 * @date 2018年12月12日
 *
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name
				+ ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
	}

}
