package com.royalgolf.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLoginEntity;

/**
 * @author DilipMehta 1. Login 2. Logout 3. changePassword 4. resePassword 5.
 *         validateUserId
 */
@Repository
public interface LoginManagerDao extends JpaRepository<UserLoginEntity, Long> {

	/*
	 * transactionid password userId
	 * 
	 */
	@Query(value = "{call Usermanager(:userId)}", nativeQuery = true)
	public Optional<UserLoginEntity> logIn(@Param("userId") String userid
	// @Param("transactionId") String transactionId,
	// @Param("password") String password,

	);

	@Query(value = "select * from user", nativeQuery = true)
	public Optional<UserLoginEntity> logOut(

	);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "{call API_ChangePassword(:userId)}", nativeQuery = true)
	public Optional<UserLoginEntity> changePassword(
			// @Param("transactionId") String transactionId,
			// @Param("oldpassword") String oldpassword,
			// @Param("newPassword") String newPassword
			@Param("userId") String userId);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "{call API_ResetPassword(:userId)}", nativeQuery = true)
	public Optional<UserLoginEntity> resetPassword(
			// @Param("transactionId") String transactionId,
			// @Param("otp") String otp,
			// @Param("newPassword") String newPassword
			@Param("userId") String userId);

}