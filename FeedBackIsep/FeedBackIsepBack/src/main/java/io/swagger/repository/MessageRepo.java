package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
	
}