package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hob")
public class HandlerInfo
{
	@Value("AAB")
	private String resolverCode;

	
	public HandlerInfo() {
		super();
		
	}


	@Override
	public String toString() {
		return "HandlerInfo [resolverCode=" + resolverCode + ", pathToStore=" + pathToStore + "]";
	}


	@Value("localhost:9090")
	private String pathToStore;
}
