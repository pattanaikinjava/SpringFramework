package in.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.example.constructor.EmployeeName;

public class ClientApp
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	     EmployeeName emp = 	context.getBean("employeeName",EmployeeName.class);
	     emp.getEmpNm();
	}

}
