package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
	
}