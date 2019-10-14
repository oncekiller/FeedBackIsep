package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.CourseDocument;

public interface CourseDocumentRepo extends JpaRepository<CourseDocument, Long> {
	
}
