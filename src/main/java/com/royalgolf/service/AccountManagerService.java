package com.royalgolf.service;

import com.royalgolf.beans.RegistrationBean;
import com.royalgolf.beans.Status;
import com.royalgolf.entities.UserLoginBean;

public interface AccountManagerService {

	public Status logIn(UserLoginBean user);

	public UserLoginBean verifyEmailusername(String emailusername);

	public Status registerUser(RegistrationBean loginRequestBean);

	public Status sendEmail(String email, String subject, String text);
	/*
	 * public UserLoginBean registerUser(UserLoginBean loginRequestBean);
	 * 
	 * 
	 * public Status sendEmailToResetPassword(String email);
	 * 
	 * 
	 * public Status logIn(LoginRequestBean user);
	 * 
	 * public Status logOut(String userId);
	 * 
	 * public Status changepasswor(Password password);
	 */

}