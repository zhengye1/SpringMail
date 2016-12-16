package com.vincent.springhibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.vincent.springhibernate.dao.MailDAO;

@Service("mailService")
public class MailServiceImpl implements MailService {

	@Autowired
	MailDAO mailDAO;
	
	@Override
	public void sendEmail(String msgBody) {
		mailDAO.sendEmail(msgBody);
	}

}
