package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.LoginManagerDao;
import com.royalgolf.entities.UserLogin;
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

	@Override
	public LoginResponse logIn(LoginRequest user) {
		LoginResponse res = new LoginResponse();
		Optional<UserLogin> logIn = loginManagerDao.logIn(user.getUserId());
		if (logIn.isPresent()) {
			UserLogin userLogin = logIn.get();
			res.setTransactionId(userLogin.getAddUser());
		}
		return res;
	}

	@Override
	public LogOutResponse logOut(LogOutRequest user) {
		// TODO Auto-generated method stub
		return null;
	}

}
