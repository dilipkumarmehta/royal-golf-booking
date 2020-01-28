package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.Status;
import com.royalgolf.dao.LoginManagerDao;
import com.royalgolf.dao.LoginManagerDaoTest;
import com.royalgolf.entities.UserLoginEntity;
import com.royalgolf.request.LogOutRequest;
import com.royalgolf.request.LoginRequest;
import com.royalgolf.response.LogOutResponse;
import com.royalgolf.response.LoginResponse;
import com.royalgolf.service.LoginManagerService;

@Service
public class LoginManagerServiceImpl implements LoginManagerService {

	private static Logger logger = LoggerFactory.getLogger(LoginManagerServiceImpl.class);

	@Autowired
	LoginManagerDao loginManagerDao;

	@Autowired
	LoginManagerDaoTest test;

	@Override
	public LoginResponse logIn(LoginRequest user) {

		LoginResponse res = new LoginResponse();
		Status status = new Status();

		Optional<UserLoginEntity> logIn = loginManagerDao.logIn(user.getUserId());
		if (logIn.isPresent() && logIn.get().getLoginid().equals(user.getUserId())) {
			status.setSuccess_code(logIn.get().getEroordesc());
			status.setSuccess_message("Success");
			res.setTransactionId(logIn.get().getTransactionId());
			res.setLoginId(logIn.get().getLoginid());
			res.setStatus(status);

		} else if (!logIn.isPresent()) {
			status.setSuccess_code("500");
			status.setError_message("Failed");
			res.setStatus(status);
			
		}

		return res;
	}

	@Override
	public LogOutResponse logOut(LogOutRequest user) {
		// TODO Auto-generated method stub
		return null;
	}

}
