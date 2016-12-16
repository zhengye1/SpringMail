package com.vincent.springhibernate.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Mail {
	
	@NotEmpty
	private String feedback;
	
	private String name;
	private String email;

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
