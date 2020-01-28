package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.EmailVerificationCodeEntity;

@Repository
public interface EmailVerificationCodeManagerDao extends JpaRepository<EmailVerificationCodeEntity, Long> {

	@Query(value = "{call API_GenerateEmailVerificationCode(:userId)}", nativeQuery = true)
	public Optional<EmailVerificationCodeEntity> generatEmailVerificationCode(@Param("userId") String userId);

}