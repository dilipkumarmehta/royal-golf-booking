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
		ValidateUserResponse res = new ValidateUserResponse();
		Status status = new Status();
		Optional<ValidateUseridEntity> validateUser = validateUseridManagerDao.ValidateUser("userID");

		if (validateUser.isPresent()) {
			status.setSuccess_code("200");
			status.setSuccess_message("Success");
			res.setIsuserexist(validateUser.get().isIsuserexist());
			res.setStatus(status);

		} else if (!validateUser.isPresent()) {
			status.setError_code("500");
			res.setStatus(status);

		}

		return res;
	}

}
