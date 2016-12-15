package com.vincent.springhibernate.service;

public interface MailService {
	public void sendEmail(String toAddress, String fromAddress, String subject, String msgBody);
}
