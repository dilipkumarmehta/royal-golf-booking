package com.royalgolf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.TestEntity;

/**
 * @author DilipMehta 1. Login 2. Logout 3. changePassword 4. resePassword 5.
 *         validateUserId
 */
@Repository
public interface LoginManagerDaoTest extends JpaRepository<TestEntity, Long> {

	@Query(value = "{call aprocedure}", nativeQuery = true)
	public List<TestEntity> testdata();
	// @Param("password") String password,
	// @Param("usercode") String usercode

}