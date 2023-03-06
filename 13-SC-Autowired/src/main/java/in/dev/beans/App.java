package in.dev.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.dev.packagescan.SpringScanPackage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx =
        		 new AnnotationConfigApplicationContext(SpringScanPackage.class);
        		System.out.println(ctx.getBean("myServic"));
    }
}
