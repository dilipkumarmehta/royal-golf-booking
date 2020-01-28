package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.EmailVerificationManagerDao;
import com.royalgolf.entities.EmailVerificationEntity;
import com.royalgolf.response.EmailVarificationResponse;
import com.royalgolf.service.VerifyEmailManagerService;

@Service
@CacheConfig(cacheNames = "email")
public class VerifyEmailManagerServiceImpl implements VerifyEmailManagerService {

	@Autowired
	EmailVerificationManagerDao emailVerificationManagerDao;
	private EmailVerificationEntity emailVerificationEntity;

	@Override
	public EmailVarificationResponse verifyEmail(String uniqueCode, String userId) {
		EmailVarificationResponse res = new EmailVarificationResponse();
		Optional<EmailVerificationEntity> verifyEmail = emailVerificationManagerDao.verifyEmail(uniqueCode, userId);
		if (verifyEmail.isPresent()) {
			emailVerificationEntity = verifyEmail.get();
			res.setEmailverifiedstatus(emailVerificationEntity.getEmailverifiedstatus());
			res.setStatus(emailVerificationEntity.getStatus());
			res.setEroordesc(emailVerificationEntity.getErrorcode());
			res.setEroordesc(emailVerificationEntity.getEroordesc());
		}
		return res;

	}

}
