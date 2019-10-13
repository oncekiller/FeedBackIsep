package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.UserCourse;

public interface UserCourseRepo extends JpaRepository<UserCourse, Long> {
	
}