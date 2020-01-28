package com.royalgolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.royalgolf.beans.EmailBean;
import com.royalgolf.beans.Status;
import com.royalgolf.request.ChangePasswordRequest;
import com.royalgolf.request.GetProfileRequest;
import com.royalgolf.request.LogOutRequest;
import com.royalgolf.request.LoginRequest;
import com.royalgolf.request.OtpRequest;
import com.royalgolf.request.ResetPasswordRequest;
import com.royalgolf.request.UpdateProfileRequest;
import com.royalgolf.request.UserRegistrationRequest;
import com.royalgolf.response.ChangePasswordResponse;
import com.royalgolf.response.EmailVarificationCodeResponse;
import com.royalgolf.response.EmailVarificationResponse;
import com.royalgolf.response.GetProfileResponse;
import com.royalgolf.response.LogOutResponse;
import com.royalgolf.response.LoginResponse;
import com.royalgolf.response.OtpResponse;
import com.royalgolf.response.ResetPasswordResponse;
import com.royalgolf.response.UpdateProfileResponse;
import com.royalgolf.response.UserRegistrationResponse;
import com.royalgolf.response.ValidateUserResponse;
import com.royalgolf.service.EmailService;
import com.royalgolf.service.LoginManagerService;
import com.royalgolf.service.RegistrationManagerService;
import com.royalgolf.service.ValidateUserManagerService;
import com.royalgolf.service.VerificationCodeService;
import com.royalgolf.service.VerifyEmailManagerService;

/**
 * @author DilipMehta
 *
 */
@RestController

@RequestMapping("/account")
public class AccountManagerController {

	Logger logger = LoggerFactory.getLogger(AccountManagerController.class);

	@Autowired
	LoginManagerService loginMangerService;

	@Autowired
	ValidateUserManagerService validateUserManagerService;

	@Autowired
	RegistrationManagerService registrationManagerService;

	@Autowired
	VerificationCodeService verificationCodeService;
	@Autowired
	VerifyEmailManagerService verifyEmailManagerService;

	@Autowired
	EmailService emailService;

	/**
	 * This method is for existing user to login, it will take user_name/email and
	 * password validate from database.
	 * 
	 * @param userLoginBean
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public LoginResponse signIn(@RequestBody LoginRequest loginRequest) {
		LoginResponse logInRes = loginMangerService.logIn(loginRequest);
		return logInRes;

	}

	@RequestMapping(value = "logout", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public LogOutResponse logOut(@RequestBody LogOutRequest logOutRequest) {
		LogOutResponse logOut = loginMangerService.logOut(logOutRequest);
		return logOut;

	}

	@RequestMapping(value = "otp", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public OtpResponse getOtp(@RequestBody OtpRequest otpRequest) {

		return verificationCodeService.generateOtp(otpRequest);

	}

	/**
	 * Verify userId in DB, it is available or not
	 * 
	 * @param emailusername
	 * @return
	 */
	@RequestMapping(value = "validateuserid", method = RequestMethod.GET)
	public ValidateUserResponse validateUserid(@RequestParam(value = "userId") String userId,
			@RequestHeader("transactionId") String transactionId) {
		ValidateUserResponse validateUserRes = validateUserManagerService.validateUserid(userId);
		if (validateUserRes != null && validateUserRes.getStatus().getSuccess_code().equals("200")) {
			validateUserRes.setTransactionid(transactionId);
			Status status = validateUserRes.getStatus();
			status.setStatus("success");
			validateUserRes.setStatus(status);
			return validateUserRes;
		}
		if (validateUserRes != null && validateUserRes.getStatus().getSuccess_code().equals("500")) {
			validateUserRes.setTransactionid(transactionId);
			Status status = validateUserRes.getStatus();
			status.setStatus("Failure");
			validateUserRes.setStatus(status);
			return validateUserRes;
		}
		return null;
	}

	@RequestMapping(value = "registration", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public UserRegistrationResponse userRegistration(@RequestBody UserRegistrationRequest registrationRequest) {
		UserRegistrationResponse registerUser = registrationManagerService.registerUser(registrationRequest);
		return registerUser;

	}

	/*
	 * This API will take email ID as input to the link in your email inbox, once
	 * you click on link will redirect to reset-password in case of forage password
	 */
	@RequestMapping(value = "accountrecovery", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status sendEmail(@RequestBody EmailBean arBean) {
		emailService.sendEmail(arBean.getEmail(), arBean.getSubject(), arBean.getMessage());
		return null;
	}

	// provide the password and conform password to reset password based on your
	// email ID
	@RequestMapping(value = "resetpassword", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public ResetPasswordResponse resetPassword(@RequestBody ResetPasswordRequest resetPasswordReq) {

		return null;
	}

	/*
	 * This Api will take the old and new password as input to change the password
	 * and set the email your password has been changed.
	 */
	@RequestMapping(value = "changepassword", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public ChangePasswordResponse changePassword(@RequestBody ChangePasswordRequest changePasswordReq) {
		// return userService.changepasswor(password);
		return null;
	}

	/**
	 * This Api will activate your account for first time.
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "verifyemail", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public EmailVarificationResponse verifyEmail(@RequestParam(value = "uniqueCode") String uniqueCode,
			@RequestParam(value = "userId") String userId, @RequestHeader("transactionId") String transactionId) {
		EmailVarificationResponse verifyEmail = verifyEmailManagerService.verifyEmail(uniqueCode, userId);
		verifyEmail.setTransactionid(transactionId);
		return verifyEmail;
	}

	/**
	 * update the profile details
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "profile", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public UpdateProfileResponse updateProfile(@RequestBody UpdateProfileRequest profileRequest) {

		return null;
	}

	@RequestMapping(value = "profile", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public GetProfileResponse getProfile(@RequestBody GetProfileRequest getProfileRequest) {

		return null;
	}

	/**
	 * get your trip details
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "mytrip", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public Status getTripDetails(@RequestParam(value = "userId") String userId) {

		return null;
	}

	@RequestMapping(value = "verificationcode", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public EmailVarificationCodeResponse generatEmailVerificationCode(@RequestParam(value = "userId") String userId) {
		EmailVarificationCodeResponse generatEmailVerificationCode = verificationCodeService
				.generatEmailVerificationCode(userId);
		return null;
	}

}
