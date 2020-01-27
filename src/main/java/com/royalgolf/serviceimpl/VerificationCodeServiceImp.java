package com.royalgolf.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.EmailVerificationCodeManagerDao;
import com.royalgolf.request.OtpRequest;
import com.royalgolf.response.EmailVarificationCodeResponse;
import com.royalgolf.response.OtpResponse;
import com.royalgolf.service.VerificationCodeService;

@Service
public class VerificationCodeServiceImp implements VerificationCodeService {

	@Autowired
	EmailVerificationCodeManagerDao emailVerificationCodeManagerDao;

	@Override
	public OtpResponse generateOtp(OtpRequest otpRequest) {

		//emailVerificationCodeManagerDao.getOtp(otpRequest.getTransactionId(), otpRequest.getTransactiontTyp(),
				//otpRequest.getUserId());
		return null;
	}

	@Override
	public EmailVarificationCodeResponse generatEmailVerificationCode(String userId) {
		emailVerificationCodeManagerDao.generatEmailVerificationCode(userId);
		return null;
	}

}