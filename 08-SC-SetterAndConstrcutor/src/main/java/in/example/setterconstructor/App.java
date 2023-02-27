package in.example.setterconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.company.constructor.Employeee;
import in.company.setter.CompanyName;

/**
 * Hello world!
 *
 */
public class App 
{
	private static  ApplicationContext context ;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       context = new 
    		    ClassPathXmlApplicationContext("springconfig.xml");
       CompanyName compnayName = (CompanyName) context.getBean("cob");
      // System.out.println(compnayName.getCompName());
       Employeee emp = (Employeee) context.getBean("eomp");
       String empnm = emp.getEmployeeNm();
      // System.out.println(empnm);
       System.out.println("Employee "+ empnm + " is working on company "+ compnayName.getCompName());
    }
}
