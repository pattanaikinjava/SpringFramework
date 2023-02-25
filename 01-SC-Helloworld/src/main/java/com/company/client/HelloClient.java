package com.company.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.beans.HelloBean;

public class HelloClient 
{
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("appConfig.xml");
		HelloBean beanObj = (HelloBean) context.getBean("helloBean",HelloBean.class);
		System.out.println(beanObj.getHelloMessage());
	}

}
