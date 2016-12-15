package com.vincent.springhibernate.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vincent.springhibernate.configuration.AppConfig;
import com.vincent.springhibernate.configuration.MailConfig;
import com.vincent.springhibernate.service.MailService;
import com.vincent.springhibernate.service.MailServiceImpl;

public class MainTest {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		 AnnotationConfigApplicationContext ctx = 
				   new AnnotationConfigApplicationContext();
		 ctx.register(MailConfig.class);
		 ctx.register(AppConfig.class);
		 ctx.refresh();
		 
		 MailService mail = (MailService)ctx.getBean(MailServiceImpl.class);
		 mail.sendEmail("ye.zheng@mail.utoronto.ca", "vincentcheng787@gmail.com", "SpringMail", "Hello from Spring Mail project");
	}
}
