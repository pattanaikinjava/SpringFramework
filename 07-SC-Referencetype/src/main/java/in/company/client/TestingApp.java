
package in.company.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.company.service.Service;

/**
 * Hello world!
 *
 */
public class TestingApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context 
        = new 
            ClassPathXmlApplicationContext
               ("springconfig.xml");
        Service s = context.getBean("service",Service.class);
        System.out.println(s);
        
    }
}
