package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.Status;
import com.royalgolf.dao.EmailVerificationCodeManagerDao;
import com.royalgolf.dao.RegistrationManagerDao;
import com.royalgolf.dao.ValidateUseridManagerDao;
import com.royalgolf.entities.EmailVerificationCodeEntity;
import com.royalgolf.entities.RegisterEntity;
import com.royalgolf.entities.ValidateUseridEntity;
import com.royalgolf.request.UserRegistrationRequest;
import com.royalgolf.response.UserRegistrationResponse;
import com.royalgolf.service.EmailService;
import com.royalgolf.service.RegistrationManagerService;

@Service
public class RegistrationManagerServiceImpl implements RegistrationManagerService {

	@Autowired
	RegistrationManagerDao registrationManagerDao;

	@Autowired
	EmailVerificationCodeManagerDao emailVerificationCodeManagerDao;

	@Autowired
	ValidateUseridManagerDao validateUseridManagerDao;

	@Autowired
	EmailService emailService;

	@Override
	public UserRegistrationResponse registerUser(UserRegistrationRequest registerRequest) {
		Status status = new Status();
		UserRegistrationResponse userRegistrationResponse = new UserRegistrationResponse();
		Optional<ValidateUseridEntity> validateUser = validateUseridManagerDao.ValidateUser("userId");

		if (validateUser.isPresent() && validateUser.get().isIsuserexist()) {
			Optional<RegisterEntity> register = register(registerRequest);
			
			if (register.isPresent()) {
				Optional<EmailVerificationCodeEntity> generatEmailVerificationCode = emailVerificationCodeManagerDao
						.generatEmailVerificationCode("userId");
				if (generatEmailVerificationCode.isPresent()) {
					//String codegenerationdate = generatEmailVerificationCode.get().getCodegenerationdate();
					String uniquecode = generatEmailVerificationCode.get().getUniquecode();
					String verfiyEmailURL = getVerfiyEmailURL(uniquecode, registerRequest.getUserId());
					emailService.sendEmail(registerRequest.getUserId(), verfiyEmailURL, "successfully registered");
					status.setSuccess_message(
							"You have successfully registered with email " + registerRequest.getUserId());
					status.setSuccess_code("200");
				}
			}
		}
		userRegistrationResponse.setStatus(status);
		return userRegistrationResponse;

	}

	private String getVerfiyEmailURL(String uniquecode, String userId) {
		String emailURL = "http://localhost:8089/account/verifyemail?uniqueCode=" + uniquecode + "&userId=" + userId
				+ "";
		System.out.println(emailURL);
		return emailURL;

	}
	private Optional<RegisterEntity>  register(UserRegistrationRequest registerRequest){
		Optional<RegisterEntity> register = registrationManagerDao.register(
				registerRequest.getFirstName(),
				registerRequest.getLastName(),
				registerRequest.getUserId(), 
				registerRequest.getPassword(),
				registerRequest.getMobileNo(),
				registerRequest.getCountryCode(), 
				registerRequest.getGender(), 
				registerRequest.getCity(),
				registerRequest.getCountry(),
				registerRequest. getAddressLine());
		return register;
		
	}

	

}