package com.royalgolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.royalgolf.beans.EmailBean;
import com.royalgolf.beans.Password;
import com.royalgolf.beans.RegistrationBean;
import com.royalgolf.beans.Status;
import com.royalgolf.entities.UserLoginBean;
import com.royalgolf.service.AccountManagerService;

/**
 * @author DilipMehta
 *
 */
@RestController

@RequestMapping("/account")
public class AccountManagerController {

	@Autowired
	AccountManagerService userService;
	Logger logger = LoggerFactory.getLogger(AccountManagerController.class);

	/**
	 * This method is for existing user to login, it will take user_name/email and
	 * password validate from database.
	 * 
	 * @param userLoginBean
	 * @return
	 */
	@RequestMapping(value = "sign-in", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status signIn(@RequestBody UserLoginBean userLoginBean) {
		Status status = new Status();
		Status logIn = userService.logIn(userLoginBean);
		return logIn;

	}

	/**
	 * Verify email in DB, it is available or not
	 * 
	 * @param emailusername
	 * @return
	 */
	@RequestMapping(value = "email-verification", method = RequestMethod.GET)
	public Status isUserRegistered(@RequestParam(value = "emailusername") String emailusername) {
		Status status = new Status();
		UserLoginBean loginResponsc = userService.verifyEmailusername(emailusername);
		if (loginResponsc == null) {
			status.setSuccess_message("There is no account associated with this email address");
			status.setSuccess_code("400");
			return status;
		}
		status.setSuccess_message("You already have a account registered to this email address");
		status.setSuccess_code("403");
		return status;

	}

	@RequestMapping(value = "registration", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status userRegistration(@RequestBody RegistrationBean registrationBean) {
		Status status = new Status();

		UserLoginBean loginResponsc = userService.verifyEmailusername(registrationBean.getEmail());
		if (loginResponsc != null) {
			status.setError_message("You already have a account registered to this email go for login");
			status.setError_code("403");
			return status;
		}
		Status statusRs = userService.registerUser(registrationBean);
		if (statusRs != null && statusRs.getSuccess_code().equals("200")) {
			status.setSuccess_message("You have successfully registered with email " + registrationBean.getEmail());
			status.setSuccess_code("200");
			return status;
		}
		status.setSuccess_message("Erro occured while creating account please try again");
		status.setSuccess_code("500");
		return status;
	}

	/*
	 * This API will take email ID as input to the link in your email inbox, once
	 * you click on link will redirect to reset-password in case of forage password
	 */
	@RequestMapping(value = "account-recovery", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status accountRecovery(@RequestBody EmailBean arBean) {
		userService.sendEmail(arBean.getEmail(), arBean.getSubject(), arBean.getMessage());
		return null;
	}

	// provide the password and conform password to reset password based on your
	// email ID
	@RequestMapping(value = "reset-password", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Status resetPassword(@RequestBody UserLoginBean user) {

		return null;
	}

	/*
	 * This Api will take the old and new password as input to change the password
	 * and set the email your password has been changed.
	 */
	@RequestMapping(value = "change-password", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Status changePassword(@RequestBody Password password) {
		// return userService.changepasswor(password);
		return null;
	}

	/**
	 * This Api will activate your account for first time.
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "account-activation", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status activateAccount(@RequestParam(value = "email") String email) {

		return null;
	}

	/**
	 * update the profile details
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "profile", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public Status updateProfile(@RequestParam(value = "email") String email) {

		return null;
	}

	@RequestMapping(value = "profile", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Status getProfile(@RequestParam(value = "email") String email) {

		return null;
	}

	/**
	 * get your trip details
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "mytrip", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Status getTripDetails(@RequestParam(value = "email") String email) {

		return null;
	}

}
