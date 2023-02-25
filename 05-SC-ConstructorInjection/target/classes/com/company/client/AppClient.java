package com.company.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.company.network.NetworkService;

public class AppClient
{
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring.xml");
		NetworkService net = ctx.getBean("networkService",
				NetworkService.class)
				;
			net.getServiceConn("JIO");
	}

}
