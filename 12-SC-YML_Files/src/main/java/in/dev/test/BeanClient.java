package in.dev.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.dev.bean.MyBean;
import in.dev.config.ConfigPackage;

public class BeanClient
{
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigPackage.class);
		MyBean bean = context.getBean("myBean",MyBean.class);
		System.out.println(bean);
	}

}
