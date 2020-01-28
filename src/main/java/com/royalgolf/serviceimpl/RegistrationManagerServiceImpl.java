package com.royalgolf.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.RegistrationManagerDao;
import com.royalgolf.request.UserRegistrationRequest;
import com.royalgolf.response.UserRegistrationResponse;
import com.royalgolf.service.RegistrationManagerService;

@Service
public class RegistrationManagerServiceImpl implements RegistrationManagerService {

	@Autowired 
	RegistrationManagerDao registrationManagerDao;
	
	@Override
	public UserRegistrationResponse registerUser(UserRegistrationRequest RegisterRequest) {
		// TODO Auto-generated method stub

		// get actual response and convert to UserRegistrationResponse
		return null;
	}

}