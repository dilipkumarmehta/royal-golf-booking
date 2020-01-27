package com.royalgolf.serviceimpl;

import org.springframework.stereotype.Service;

import com.royalgolf.request.UserRegistrationRequest;
import com.royalgolf.response.UserRegistrationResponse;
import com.royalgolf.service.RegistrationManagerService;

@Service
public class RegistrationManagerServiceImpl implements RegistrationManagerService {

	
	@Override
	public UserRegistrationResponse registerUser(UserRegistrationRequest RegisterRequest) {
		// TODO Auto-generated method stub

		// get actual response and convert to UserRegistrationResponse
		return null;
	}

}