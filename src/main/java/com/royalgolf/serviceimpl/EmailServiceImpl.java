package com.royalgolf.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.royalgolf.beans.Status;
import com.royalgolf.service.EmailService;

@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender javaMailSender;

	@Async
	public Status sendEmail(String email, String subject, String text) {
		Status status = new Status();
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(email);
			msg.setSubject(subject);
			msg.setText(text);
			javaMailSender.send(msg);
			status.setSuccess_message("Email send succssfully");
			status.setSuccess_code("200");
		} catch (Exception e) {
			status.setSuccess_message("Failed");
			status.setError_code("500");
			e.printStackTrace();
		}
		return status;

	}
}