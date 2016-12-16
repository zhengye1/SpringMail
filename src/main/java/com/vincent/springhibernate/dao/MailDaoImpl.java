package com.vincent.springhibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Repository;

@Repository("mailDAO")
public class MailDaoImpl implements MailDAO {

	final String fromAddress = "vincentcheng787@gmail.com";
	final String toAddress = "ye.zheng@mail.utoronto.ca";
	final String subject = "A student just send you an anonymous feedback";
	
	@Autowired
	private MailSender mailSender;

	@Override
	public void sendEmail(String msgBody){
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(fromAddress);
		msg.setTo(toAddress);
		msg.setSubject(subject);
		msg.setText(msgBody);
		mailSender.send(msg);
	}
}
