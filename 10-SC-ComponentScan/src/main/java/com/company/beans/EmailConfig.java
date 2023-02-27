package com.company.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailobj")
public class EmailConfig 
{
	@Value("gmail")
    private String hostName;
   

	@Override
	public String toString() {
		return "EmailConfig [hostName=" + hostName + ", ipAddress=" + ipAddress + ", emailTo=" + emailTo
				+ ", emailFrom=" + emailFrom + "]";
	}

	@Value("localhost")
	private String ipAddress;
    
	@Value("abc@gmail.com")
    private String emailTo;
    
	@Value("xyz@gmail.com")
    private String emailFrom;
    
}
