package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.CourseMaterial;

public interface CourseMaterialApiDelegate {
	default ResponseEntity<CourseMaterial> addCourseMaterialImpl(CourseMaterial courseMaterial) {
        return new ResponseEntity<CourseMaterial>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteCourseMaterialImpl(String courseMaterialId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<CourseMaterial>> getAllCourseMaterialImpl(){
        return new ResponseEntity<List<CourseMaterial>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<CourseMaterial> getCourseMaterialIdImpl(String courseMaterialId){
        return new ResponseEntity<CourseMaterial>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateCourseMaterialImpl(CourseMaterial courseMaterial){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
}
