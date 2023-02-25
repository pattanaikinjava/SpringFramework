package com.company.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.beas.OracleConn;

public class TestingConnection 
{
	private static ApplicationContext context ;
	public static void main(String[] args) {
		context =
				new ClassPathXmlApplicationContext("appcontext.xml");
		OracleConn connection = 
				context.getBean("oracleConn",OracleConn.class);
		System.out.println( connection);
		System.out.println(connection.getPassword());
		System.out.println(connection.getUrlDb());
		System.out.println(connection.getUserName());
	}
	

}
