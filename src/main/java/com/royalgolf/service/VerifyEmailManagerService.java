package com.royalgolf.service;

import com.royalgolf.response.EmailVarificationResponse;

public interface VerifyEmailManagerService {
	public EmailVarificationResponse verifyEmail(String uniqueCode,String userId);

}