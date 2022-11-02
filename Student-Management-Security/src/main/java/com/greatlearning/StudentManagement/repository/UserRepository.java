package com.greatlearning.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentManagement.Controller.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//@Query("Select u FROM User u WHERE u.username =?1")
	public User getUserByUsername(String username);
}
