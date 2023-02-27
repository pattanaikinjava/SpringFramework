package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cache")
public class CacheData
{
	@Value("Redis")
	private String provider;
	
	@Value("Tomcatlog")
	private String receiver;

	@Override
	public String toString() {
		return "CacheData [provider=" + provider + ", receiver=" + receiver + "]";
	}

}
