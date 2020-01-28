package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.RegisterEntity;

@Repository
public interface RegistrationManagerDao extends JpaRepository<RegisterEntity, Long> {

	@Query(value = "{call API_UserRegistration(:userId)}", nativeQuery = true)
	public Optional<RegisterEntity> register(
			@Param("firstName") String firstName,
			@Param("lastName") String lastName,
			@Param("userId") String userId, 
			@Param("password") String password,
			@Param("mobileNo") String mobileNo,
			@Param("countryCode") String countryCode, 
			@Param("gender") String gender, 
			@Param("city") String city,
			@Param("country") String country,
			@Param("addressLine") String addressLine);
	
}