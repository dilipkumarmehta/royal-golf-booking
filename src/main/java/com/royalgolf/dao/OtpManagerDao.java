package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.OtpEntity;

@Repository
public interface OtpManagerDao extends JpaRepository<OtpEntity, Long> {

	@Query(value = "{call API_GenerateOTP(:userId)}", nativeQuery = true)
	public Optional<OtpEntity> getOtp(
			@Param("transactionId") String transactionId,
			@Param("transactiontTyp") String transactiontTyp,
			@Param("userId") String userId);


}