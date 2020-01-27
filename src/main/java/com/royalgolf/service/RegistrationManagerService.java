package com.royalgolf.service;

import com.royalgolf.request.UserRegistrationRequest;
import com.royalgolf.response.UserRegistrationResponse;

public interface RegistrationManagerService {

	public UserRegistrationResponse registerUser(UserRegistrationRequest loginRequestBean);

}