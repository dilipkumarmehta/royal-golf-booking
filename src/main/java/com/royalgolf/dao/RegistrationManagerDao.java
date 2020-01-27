package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLogin;

@Repository
public interface RegistrationManagerDao extends JpaRepository<UserLogin, Long> {

	@Query(value = "{call API_GetProfileDetails(:userId)}", nativeQuery = true)
	public Optional<UserLogin> register();
}