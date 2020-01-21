package com.royalgolf.repository;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLoginBean;



@Repository
public interface AccountManagerRepository extends JpaRepository<UserLoginBean, Long> {

	@Query(value = "select * from usermaster where dbo.pwddecript(userpwd)=:password and EMAILUSERNAME=:emailId and USERCODE=:usercode and active=1", nativeQuery = true)
	public Optional<UserLoginBean> logIn(@Param("password") String password, @Param("emailId") String emailId,
			@Param("usercode") String usercode);

	public UserLoginBean findByemailusername(String emailusername);

	@Procedure(name = "sp_registration")
	public void register(@Param("inParam1") String inParam1);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE USER_LOGIN SET PASSWORD =:newPassword  WHERE PASSWORD =:oldPassword", nativeQuery = true)
	void changePassword(@Param("oldPassword") String oldPassword, @Param("newPassword") String newPassword);

}