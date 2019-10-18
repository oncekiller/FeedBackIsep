package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
}
