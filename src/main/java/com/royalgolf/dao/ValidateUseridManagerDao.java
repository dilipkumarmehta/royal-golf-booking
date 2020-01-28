package com.royalgolf.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.ValidateUseridEntity;


@Repository
public interface ValidateUseridManagerDao extends JpaRepository<ValidateUseridEntity, Long> {

	@Query(value = "{call API_ValidateUserId(:userId)}", nativeQuery = true)
	public Optional<ValidateUseridEntity> ValidateUser(@Param("userId") String userId);

}