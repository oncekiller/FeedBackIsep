package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {
	
}
