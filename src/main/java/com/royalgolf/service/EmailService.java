package com.royalgolf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
//https://www.google.com/settings/security/lesssecureapps 
	@Autowired
	private JavaMailSender javaMailSender;
     @Async
	public void sendEmail(String email, String subject, String text) {
		System.out.println("************Email sent");
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject(subject);
		// msg.setText("http://localhost:8089/account/reset-password");
		msg.setText(text);
		javaMailSender.send(msg);

	}
}