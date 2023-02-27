package com.company.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sms")
public class SmsRegister {

	@Override
	public String toString() {
		return "SmsRegister [message=" + message + ", phonenumber=" + phonenumber + ", otpPin=" + otpPin + "]";
	}
	@Value("Hi, How are  you ?")
	private String message;
	@Value("9900887765")
	private long phonenumber;
	@Value("9081")
	private int otpPin;
}
