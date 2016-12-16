package com.vincent.springhibernate.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vincent.springhibernate.model.Mail;
import com.vincent.springhibernate.service.MailService;

@Controller
@RequestMapping("/")
public class AppController {
	static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	MailService mailService;
	
	@RequestMapping(value="/feedback")
	public String displayFeedbackForm(Model model){
		model.addAttribute("mail", new Mail());
		return "feedback";
	}
	
	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public String sendFeedback(Model model, @Valid Mail mail, BindingResult result){
		if (result.hasErrors()){
			return "feedback";
		}
		String feedback ="";
		feedback += (!mail.getName().equals("")) ? "Student name: " + mail.getName() + "\n" : feedback;
		feedback += (!mail.getEmail().equals("")) ? "Student email: " + mail.getEmail() + "\n" : feedback;
		feedback += mail.getFeedback();
		mailService.sendEmail(feedback);
		model.addAttribute("success", "Your feedback is send successfully");
		return "submitSuccess";
	}
}
