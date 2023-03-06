package in.dev.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean
{
	
	@Override
	public String toString() {
		return "MyBean [beanId=" + beanId + ", beanName=" + beanName + ", beanLoc=" + beanLoc + ", dburl=" + dburl
				+ "]";
	}

	@Value("${my.bean.id}")
	private String beanId;
	
	@Value("${my.bean.name}")
	private String beanName;
	
	@Value("${my.bean.location}")
	private String beanLoc;
	
	@Value("${db.app.url}")
	private String dburl;

}
