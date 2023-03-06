package com.company.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DataBaseConfiguration {

	@Value("020320232316")
	private String dataBaseCode;
	
	@Override
	public String toString() {
		return "DataBaseConfiguration [dataBaseCode=" + dataBaseCode + ", dataBaseUrl=" + dataBaseUrl
				+ ", dataBaseDriver=" + dataBaseDriver + ", dataBaseUser=" + dataBaseUser + ", dataBasePwd="
				+ dataBasePwd + "]";
	}
	@Value("${my.db-url}")
	private String dataBaseUrl;
	@Value("${my.db-Driver}")
	private String dataBaseDriver;
	@Value("${my.db_user}")
	private String dataBaseUser;
	@Value("${my.db.pwd}")
	private String dataBasePwd;
}
