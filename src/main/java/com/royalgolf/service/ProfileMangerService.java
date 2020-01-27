package com.royalgolf.service;

import com.royalgolf.request.UpdateProfileRequest;
import com.royalgolf.response.GetProfileResponse;
import com.royalgolf.response.UpdateProfileResponse;

public interface ProfileMangerService {
	public GetProfileResponse getProfileDetails(String userId);

	public UpdateProfileResponse updateProfileDetails(UpdateProfileRequest profileRequest);
}
