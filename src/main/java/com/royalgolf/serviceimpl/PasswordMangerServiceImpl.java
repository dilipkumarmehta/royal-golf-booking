package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.Status;
import com.royalgolf.dao.LoginManagerDao;
import com.royalgolf.entities.UserLoginEntity;
import com.royalgolf.request.ChangePasswordRequest;
import com.royalgolf.request.ResetPasswordRequest;
import com.royalgolf.response.ChangePasswordResponse;
import com.royalgolf.response.ResetPasswordResponse;
import com.royalgolf.service.PasswordMangerService;

@Service
public class PasswordMangerServiceImpl implements PasswordMangerService {

	@Autowired
	LoginManagerDao loginManagerDao;

	@Override
	public ChangePasswordResponse changePassword(ChangePasswordRequest req) {
		ChangePasswordResponse changePasswordRes = new ChangePasswordResponse();
		Status status = new Status();

		Optional<UserLoginEntity> changePassword = loginManagerDao.changePassword("userId");
		if (changePassword.isPresent() && req.getUserId().equals(changePassword.get().getLoginid())) {
			status.setSuccess_code(changePassword.get().getEroordesc());
			status.setSuccess_message("Success");
			changePasswordRes.setTransactionId(changePassword.get().getTransactionId());

			changePasswordRes.setStatus(status);

		} else if (!changePassword.isPresent()) {
			status.setSuccess_code("500");
			status.setError_message("Failed");
			changePasswordRes.setStatus(status);

		}
		return changePasswordRes;
	}

	@Override
	public ResetPasswordResponse resetPassword(ResetPasswordRequest req) {

		ResetPasswordResponse changePasswordRes = new ResetPasswordResponse();
		Status status = new Status();
		Optional<UserLoginEntity> resetPassword = loginManagerDao.resetPassword("dfd");

		if (resetPassword.isPresent() && req.getUserId().equals(resetPassword.get().getLoginid())) {
			status.setSuccess_code(resetPassword.get().getEroordesc());
			status.setSuccess_message("Success");
			changePasswordRes.setTransactionId(resetPassword.get().getTransactionId());

			changePasswordRes.setStatus(status);

		} else if (!resetPassword.isPresent()) {
			status.setSuccess_code("500");
			status.setError_message("Failed");
			changePasswordRes.setStatus(status);

		}
		return changePasswordRes;
	}

}
