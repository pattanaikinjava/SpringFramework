package com.company.beas;

public class OracleConn 
{
	public String getUrlDb() {
		return urlDb;
	}
	public void setUrlDb(String urlDb) {
		this.urlDb = urlDb;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String urlDb;
	private String userName;
	private String password;


}
