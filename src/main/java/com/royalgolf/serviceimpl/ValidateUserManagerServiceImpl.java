package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.Status;
import com.royalgolf.dao.ValidateUseridManagerDao;
import com.royalgolf.entities.ValidateUseridEntity;
import com.royalgolf.response.ValidateUserResponse;
import com.royalgolf.service.ValidateUserManagerService;

@Service
public class ValidateUserManagerServiceImpl implements ValidateUserManagerService {

	@Autowired
	ValidateUseridManagerDao validateUseridManagerDao;

	@Override
	public ValidateUserResponse validateUserid(String userId) {
		ValidateUserResponse validateUserRes = new ValidateUserResponse();
		Status status = new Status();
		Optional<ValidateUseridEntity> validateUser = validateUseridManagerDao.ValidateUser("userID");
		if (validateUser.isPresent() && validateUser.get().isIsuserexist()) {
			status.setSuccess_message("There is no account associated with this email address");
			status.setSuccess_code("200");
			validateUserRes.setStatus(status);
			return validateUserRes;

		} else if (validateUser.isPresent() && !validateUser.get().isIsuserexist()) {
			status.setSuccess_message("You already have a account registered to this email address");
			status.setSuccess_code("403");
			validateUserRes.setStatus(status);
			return validateUserRes;
		}
		return null;

	}
}
