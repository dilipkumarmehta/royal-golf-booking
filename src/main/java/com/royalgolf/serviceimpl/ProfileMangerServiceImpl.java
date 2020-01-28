package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.dao.ProfileManagerDao;
import com.royalgolf.entities.UserProfileEntity;
import com.royalgolf.request.UpdateProfileRequest;
import com.royalgolf.response.GetProfileResponse;
import com.royalgolf.response.UpdateProfileResponse;
import com.royalgolf.service.ProfileMangerService;

@Service
public class ProfileMangerServiceImpl implements ProfileMangerService {

	@Autowired
	ProfileManagerDao profileManagerDao;

	@Override
	public GetProfileResponse getProfileDetails(String userId) {
		Optional<UserProfileEntity> profile = profileManagerDao.getProfile("userid");

		return null;
	}

	@Override
	public UpdateProfileResponse updateProfileDetails(UpdateProfileRequest profileRequest) {
		Optional<UserProfileEntity> updatePofile = profileManagerDao.updatePofile("profile data");
		return null;
	}

}
