package com.company.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApp
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
		 context = new AnnotationConfigApplicationContext();
		
		context.scan("com.company.springannotation");
		context.refresh();
		MathAdd add = context.getBean(MathAdd.class);
		System.out.println(
				add.addNums(-23, 80)
		);
		
		System.out.println(add);
	
	}

}
