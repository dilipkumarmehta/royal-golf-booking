package com.royalgolf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLogin;

@Repository
public interface EmailVerificationCodeManagerDao extends JpaRepository<UserLogin, Long> {

	@Query(value = "{call API_GenerateOTP(:userId)}", nativeQuery = true)
	public UserLogin getOtp(
			//@Param("transactionId") String transactionId,
			//@Param("transactiontTyp") String transactiontTyp,
			@Param("userId") String userId);

	@Query(value = "{call API_GenerateEmailVerificationCode(:userId)}", nativeQuery = true)
	public UserLogin generatEmailVerificationCode(
			@Param("userId") String userId);

}