package com.journaldev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainClass
{
	private static AnnotationConfigApplicationContext 
	 annotationConfigApplicationContext;
	public static void main(String[] args) {
		
		/* 1. First create empty container */
			annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext();
		/* 2. find all classes from basepackages (package and subpackage) */	
			annotationConfigApplicationContext.scan("com.journaldev.spring");
			
	    /* 3. refresh spring container */
			annotationConfigApplicationContext.refresh();
			
	   /* 4. read object*/		
			HandlerInfo info =
					annotationConfigApplicationContext.getBean("hob",HandlerInfo.class);
			
	 /* 5. print object */
			System.out.println(info);
		
		
	}

}
