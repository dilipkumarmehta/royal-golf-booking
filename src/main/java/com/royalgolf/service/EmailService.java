package com.royalgolf.service;

import com.royalgolf.beans.Status;

public interface EmailService {
	public Status sendEmail(String email, String subject, String text);
}