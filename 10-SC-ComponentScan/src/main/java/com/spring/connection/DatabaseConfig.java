package com.spring.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("database")
public class DatabaseConfig
{
	
	@Value("jdbc:oracle:driver")
	private String dbUrl;
	@Override
	public String toString() {
		return "DatabaseConfig [dbUrl=" + dbUrl + ", dbIpAddress=" + dbIpAddress + ", dbUser=" + dbUser
				+ ", dbPassword=" + dbPassword + "]";
	}

	@Value("localhost:9088")
	private String dbIpAddress;
	@Value("querty")
	private String dbUser;
	
	@Value("qwert")
	private String dbPassword;
	

}
