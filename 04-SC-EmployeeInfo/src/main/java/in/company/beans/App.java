package in.company.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Employee information is provides as follows" );
        ApplicationContext ctx = 
        		new ClassPathXmlApplicationContext("appcontext.xml");
        Employee emp = ctx.getBean("employee",Employee.class);
        System.out.println(
        		emp.getEmpDesignation());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpSalary());
    }
}
