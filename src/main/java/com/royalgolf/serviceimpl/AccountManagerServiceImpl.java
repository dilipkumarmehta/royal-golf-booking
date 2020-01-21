package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.RegistrationBean;
import com.royalgolf.beans.Status;
import com.royalgolf.entities.UserLoginBean;
import com.royalgolf.repository.AccountManagerDao;
import com.royalgolf.service.AccountManagerService;
import com.royalgolf.service.EmailService;
import com.royalgolf.util.PasswordEncoderDecoder;

@Service
@CacheConfig(cacheNames = "email")
public class AccountManagerServiceImpl implements AccountManagerService {
	private static Logger logger = LoggerFactory.getLogger(AccountManagerServiceImpl.class);

	@Autowired(required = true)
	private AccountManagerDao userServiceRepository;

	@Autowired(required = true)
	private EmailService emailService;

	@Autowired
	RegistrationService registrationService;

	@Override
	public Status logIn(UserLoginBean userLoginBean) {
		Status status = new Status();
		
		final String secretKey = "roalgolf";
	     
	    String originalString = "dilip@gmail.com";
	    String encryptedString = PasswordEncoderDecoder.encrypt(originalString, secretKey) ;
	    String decryptedString = PasswordEncoderDecoder.decrypt(encryptedString, secretKey) ;
	    
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	    
		Optional<UserLoginBean> loginUser = userServiceRepository.logIn(userLoginBean.getUserpwd(),
				userLoginBean.getEmailusername(), userLoginBean.getUserCode());

		System.out.println(userLoginBean.getUserpwd() + "\t" + userLoginBean.getEmailusername() + "\t"
				+ userLoginBean.getUserCode());
		if (loginUser.isPresent() && userLoginBean.getUserCode().equals(loginUser.get().getUserCode())) {
			status.setSuccess_message("Login success");
			status.setSuccess_code("200");
			return status;
		}
		status.setError_message("Invalid user name or password");
		status.setError_code("401");
		return status;
	}
	
	@Cacheable(cacheNames = "email", key = "{#emailusername}",unless="#result==null")
	public UserLoginBean verifyEmailusername(String emailusername) {
		UserLoginBean findByemailId = userServiceRepository.findByemailusername(emailusername);
		return findByemailId;
	}

	@Override
	public Status registerUser(RegistrationBean registrationBean) {
		Status registration = registrationService.registration(registrationBean);
		if (registration != null && registration.getSuccess_code().equals("200")) {
			emailService.sendEmail("dilip.kmd1@gmail.com", "succesfully register",
					"http://localhost:8089/account/verify-account?email=dilip%40gmail.com");
		}
		return registration;
	}

	@Override
	
	public Status sendEmail(String email, String subject, String text) {
		emailService.sendEmail(email, subject, text);
		return null;
	}
	
	@CacheEvict(cacheNames = "email", key = "{#emailusername}")
	public void delete(Integer email) {
		//delete operation
	}
	
	@CachePut(cacheNames = "email", key = "{#emailusername}")
	public void update(Integer email, String newMobileNumber) {
		// update operation
	}

}
