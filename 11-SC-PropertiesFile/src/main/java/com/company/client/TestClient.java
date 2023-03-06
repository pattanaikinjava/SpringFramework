package com.company.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.SpringConfigPackage;
import com.company.config.DataBaseConfiguration;

public class TestClient {
	public static void main(String[] args) {
		ApplicationContext  context = 
				new AnnotationConfigApplicationContext(SpringConfigPackage.class);
		DataBaseConfiguration ob = (DataBaseConfiguration) context.getBean("con");
		System.out.println(ob);
	}
}
