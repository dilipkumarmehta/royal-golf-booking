package com.royalgolf.service;

import com.royalgolf.request.OtpRequest;
import com.royalgolf.response.EmailVarificationCodeResponse;
import com.royalgolf.response.OtpResponse;

public interface VerificationCodeService {

	public EmailVarificationCodeResponse generatEmailVerificationCode(String userId);

	public OtpResponse generateOtp(OtpRequest otpRequest);
}