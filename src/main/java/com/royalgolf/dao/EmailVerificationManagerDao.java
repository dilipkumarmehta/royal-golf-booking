package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.EmailVerificationEntity;

@Repository
public interface EmailVerificationManagerDao extends JpaRepository<EmailVerificationEntity, Long> {
	@Query(value = "{call API_VerifyEmail(:userId)}", nativeQuery = true)
	public Optional<EmailVerificationEntity> verifyEmail(
			@Param("uniqueCode") String uniqueCode,
			@Param("userId") String userId);

}