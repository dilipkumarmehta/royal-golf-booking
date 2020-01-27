package com.royalgolf.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLogin;

/**
 * @author DilipMehta 1. Login 2. Logout 3. changePassword 4. resePassword 5.
 *         validateUserId
 */
@Repository
public interface LoginManagerDao extends JpaRepository<UserLogin, Long> {

	@Query(value = "{call Usermanager(:userId)}", nativeQuery = true)
	public Optional<UserLogin> logIn(@Param("userId") String userid
			//@Param("password") String password,
			//@Param("usercode") String usercode
			);

	@Query(value = "{call API_ValidateUserId(:userId)}", nativeQuery = true)
	public UserLogin ValidateUser(@Param("userId") String userId);

	@Query(value = "select * from user", nativeQuery = true)
	public void logOut(
	// @Param("oldPassword") String oldPassword,
	// @Param("newPassword") String newPassword
	);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "{call API_ChangePassword(:userId)}", nativeQuery = true)
	public void changePassword(
			// @Param("oldPassword") String oldPassword,
			// @Param("newPassword") String newPassword
			@Param("userId") String userId);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "{call API_ResetPassword(:userId)}", nativeQuery = true)
	public void resetPassword(
			// @Param("oldPassword") String oldPassword,
			// @Param("newPassword") String newPassword
			@Param("userId") String userId);

}