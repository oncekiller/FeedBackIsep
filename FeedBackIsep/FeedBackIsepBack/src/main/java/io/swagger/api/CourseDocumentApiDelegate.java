package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.CourseDocument;

public interface CourseDocumentApiDelegate {
	
	default ResponseEntity<CourseDocument> addCourseDocumentImpl(CourseDocument courseDocument) {
        return new ResponseEntity<CourseDocument>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteCourseDocumentImpl(String courseDocumentId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<CourseDocument>> getAllCourseDocumentCourseIdImpl(String courseId){
        return new ResponseEntity<List<CourseDocument>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<CourseDocument>> getAllCourseDocumentUserPostIdCourseIdImpl(String userPostId , String courseId){
        return new ResponseEntity<List<CourseDocument>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<CourseDocument>> getAllCourseDocumentUserPostIdImpl(String userPostId){
        return new ResponseEntity<List<CourseDocument>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<CourseDocument>> getAllCourseDocumentImpl(){
        return new ResponseEntity<List<CourseDocument>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<CourseDocument> getCourseDocumentIdImpl(String courseDocumentId){
        return new ResponseEntity<CourseDocument>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateCourseDocumentImpl(CourseDocument courseDocument){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
}
