package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.EmailVerificationCodeManagerDao;
import com.royalgolf.dao.OtpManagerDao;
import com.royalgolf.entities.EmailVerificationCodeEntity;
import com.royalgolf.entities.OtpEntity;
import com.royalgolf.request.OtpRequest;
import com.royalgolf.response.EmailVarificationCodeResponse;
import com.royalgolf.response.OtpResponse;
import com.royalgolf.service.VerificationCodeService;

@Service
public class VerificationCodeServiceImp implements VerificationCodeService {

	@Autowired
	OtpManagerDao otpManagerDao;
	
	@Autowired
	EmailVerificationCodeManagerDao emailVerificationCodeManagerDao;
	
	@Override
	public OtpResponse generateOtp(OtpRequest otpRequest) {
		OtpResponse res = new OtpResponse();

		Optional<OtpEntity> otp = otpManagerDao.getOtp(otpRequest.getTransactionId(), otpRequest.getTransactiontTyp(),
				otpRequest.getUserId());
		if (otp.isPresent()) {
			OtpEntity otpEntity = otp.get();
			res.setTransactionId(otpEntity.getTransactionId());
			res.setOtp(otpEntity.getOtp());
			res.setStatus(otpEntity.getStatus());
			res.setEroordesc(otpEntity.getErrorcode());
			res.setEroordesc(otpEntity.getEroordesc());

		}
		return res;
	}

	@Override
	public EmailVarificationCodeResponse generatEmailVerificationCode(String userId) {
		EmailVarificationCodeResponse res = new EmailVarificationCodeResponse();
		Optional<EmailVerificationCodeEntity> generatEmailVerificationCode = emailVerificationCodeManagerDao
				.generatEmailVerificationCode(userId);

		if (generatEmailVerificationCode.isPresent()) {
			EmailVerificationCodeEntity emaiEntity = generatEmailVerificationCode.get();
			res.setTransactionId(emaiEntity.getTransactionId());
			res.setUniqueCode(emaiEntity.getUniquecode());
			res.setCodeGenerationDate(emaiEntity.getCodegenerationdate());
			res.setStatus(emaiEntity.getStatus());
			res.setEroordesc(emaiEntity.getErrorcode());
			res.setEroordesc(emaiEntity.getEroordesc());

		}
		return res;

	}

}