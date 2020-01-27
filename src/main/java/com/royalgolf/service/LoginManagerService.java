package com.royalgolf.service;

import com.royalgolf.request.LogOutRequest;
import com.royalgolf.request.LoginRequest;
import com.royalgolf.response.LogOutResponse;
import com.royalgolf.response.LoginResponse;

public interface LoginManagerService {

	public LoginResponse logIn(LoginRequest user);

	public LogOutResponse logOut(LogOutRequest user);

}