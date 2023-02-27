package com.company.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MathAdd
{
	public int addNums(int a, int b) {
		System.out.println(this.mathBook);
		return a+b;
	}
	
	@Value("R.D Sharma")
	
	private String mathBook;

	@Override
	public String toString() {
		return "MathAdd [mathBook=" + mathBook + "]";
	}

	public MathAdd() {
		super();
		
	}
	
	
	
}
