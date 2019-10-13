package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.Course;

public interface CourseApiDelegate {
	default ResponseEntity<Course> addCourseImpl(Course course) {
        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteCourseImpl(String courseId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesUserIdImpl(String userId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesTeacherIdImpl(String teacherId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesMaterialIdImpl(String materialId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesTeacherIdUserIdImpl(String teacherId,String userId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesTeacherIdMaterialIdImpl(String teacherId,String materialId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesMaterialIdUserIdImpl(String materialId, String userId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesMaterialIdUserIdTeacherIdImpl(String materialId, String userId, String teacherId){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Course>> getAllCoursesImpl(){
        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<Course> getCourseIdImpl(String courseId){
        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateCourseImpl(Course course){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
}
