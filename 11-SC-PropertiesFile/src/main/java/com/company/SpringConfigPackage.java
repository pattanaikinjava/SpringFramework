package com.company;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:myapp.properties")
@ComponentScan(basePackages = "com.company")
public class SpringConfigPackage 
{
	

}
