package com.vincent.springhibernate.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Mail {
	
	@NotEmpty
	private String feedback;

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
