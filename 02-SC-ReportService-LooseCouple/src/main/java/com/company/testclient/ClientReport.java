package com.company.testclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.client.ReportGenerator;

public class ClientReport 
{
	public static void main(String[] args) {
		ApplicationContext ctx =
				  new ClassPathXmlApplicationContext("appConfig.xml");
		ReportGenerator generator = ctx.getBean("reportGenerator",ReportGenerator.class);
		generator.callReport();
		
	}

}
