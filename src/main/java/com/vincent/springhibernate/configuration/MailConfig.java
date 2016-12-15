package com.vincent.springhibernate.configuration;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;;

@Configuration
@ComponentScan({ "com.vincent.springhibernate.configuration" })
@PropertySource(value = { "classpath:mail.properties" })
public class MailConfig {
	static final Logger logger = LoggerFactory.getLogger(MailConfig.class);

	@Autowired
	private Environment environment;

	@Bean
	public JavaMailSender javaMailService() {
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		javaMailSender.setHost(environment.getProperty("host"));
		javaMailSender.setPort(Integer.valueOf(environment.getProperty("port")));
		javaMailSender.setUsername(environment.getProperty("username"));
		javaMailSender.setPassword(environment.getProperty("password"));
		javaMailSender.setJavaMailProperties(getMailProperties());
		return javaMailSender;
	}

	private Properties getMailProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.debug", "true");
		return properties;
	}

}
