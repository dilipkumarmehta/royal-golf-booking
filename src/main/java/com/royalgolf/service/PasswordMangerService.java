package com.royalgolf.service;

import com.royalgolf.request.ChangePasswordRequest;
import com.royalgolf.request.ResetPasswordRequest;
import com.royalgolf.response.ChangePasswordResponse;
import com.royalgolf.response.ResetPasswordResponse;

public interface PasswordMangerService {
	public ChangePasswordResponse changePassword(ChangePasswordRequest changePasswordReq);

	public ResetPasswordResponse resetPassword(ResetPasswordRequest resetPasswordReq);
}
