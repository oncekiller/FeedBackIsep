package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.CourseMaterial;

public interface CourseMaterialRepo extends JpaRepository<CourseMaterial, Long> {
	
}
