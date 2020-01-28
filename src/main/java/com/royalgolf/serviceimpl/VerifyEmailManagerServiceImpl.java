package com.royalgolf.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.VerifyEmailRequest;
import com.royalgolf.dao.EmailVerificationManagerDao;
import com.royalgolf.service.VerifyEmailManagerService;

@Service
@CacheConfig(cacheNames = "email")
public class VerifyEmailManagerServiceImpl implements VerifyEmailManagerService {

	@Autowired
	EmailVerificationManagerDao emailVerificationManagerDao;

	@Override
	public void verifyEmail(VerifyEmailRequest verifyEmailRequest) {
		// TODO Auto-generated method stub

	}

}
