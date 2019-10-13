package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Conversation;

public interface ConversationRepo extends JpaRepository<Conversation, Long> {
	
}