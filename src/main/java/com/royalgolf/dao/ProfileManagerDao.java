package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLogin;

@Repository
public interface ProfileManagerDao extends JpaRepository<UserLogin, Long> {

	@Query(value = "{call API_UpdateProfile(:userId)}", nativeQuery = true)
	public Optional<UserLogin> updatePofile(@Param("userId") String userId
			//@Param("password") String password,
			//@Param("usercode") String usercode
			);

	@Query(value = "{call API_GetProfileDetails(:userId)}", nativeQuery = true)
	public UserLogin getProfile(@Param("userId") String userId);
}