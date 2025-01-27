package com.book.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.book.models.User;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,String>
{
	@Transactional
	@Modifying
	@Query("update User u set u.password=:pass where u.userid=:uid")
	void updateUserPassword(@Param("pass") String pass,@Param("uid") String uid);
}
