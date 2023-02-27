package in.company.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.company.network.NetworkService;

public class NetworkClient 
{
	private static ApplicationContext context ;
	public static void main(String[] args) {
		
		context  = new ClassPathXmlApplicationContext("spring.xml");
		NetworkService ser
		 = context.getBean("networkService",NetworkService.class);
		String servicename = "JIO";
		ser.getServiceConn(servicename);
		try {
			Thread.sleep(10000);
		}catch(Exception e) {}
		ser.getServiceDisConn(servicename);
	}

}
