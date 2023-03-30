package com.cakeathome.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.security.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findUserByUsername(String username);
	
	User findUserByEmail(String email);

}
