package com.company.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.test.CacheData;
import com.company.AppConfiguration;
import com.company.beans.EmailConfig;
import com.spring.connection.DatabaseConfig;

import my.format.one.ViewResolver;

public class AppClient
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext 
		 context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		context.scan("com.company");
		//context.refresh();
		EmailConfig emailconfig =  context.getBean("emailobj",EmailConfig.class);
		System.out.println(emailconfig);
	     Object obj1 = context.getBean("sms");
	     System.out.println(obj1);
		context.scan("com.spring");
		DatabaseConfig dbConfig = (DatabaseConfig) context.getBean("database");
		System.out.println(dbConfig);
		
		context.scan("my.format");
		ViewResolver v1 = (ViewResolver) context.getBean("viewresolve");
		System.out.println(v1);
		
		context.scan("com.app");
		CacheData cache = (CacheData) context.getBean("cache");
		System.out.println(
				cache
		);
	
		
	}

}
