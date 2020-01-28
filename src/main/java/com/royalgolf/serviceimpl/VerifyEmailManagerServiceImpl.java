package com.royalgolf.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.EmailVerificationManagerDao;
import com.royalgolf.response.EmailVarificationResponse;
import com.royalgolf.service.VerifyEmailManagerService;

@Service
@CacheConfig(cacheNames = "email")
public class VerifyEmailManagerServiceImpl implements VerifyEmailManagerService {

	@Autowired
	EmailVerificationManagerDao emailVerificationManagerDao;

	@Override
	public EmailVarificationResponse verifyEmail(String uniqueCode,String userId) {
		return null;
		// TODO Auto-generated method stub

	}

}
