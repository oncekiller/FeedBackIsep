package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.UserCourse;

public interface UserCourseApiDelegate {
	
	default ResponseEntity<UserCourse> addUserCourseImpl(UserCourse userCourse) {
        return new ResponseEntity<UserCourse>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteUserCourseImpl(String userCourseId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<UserCourse>> getAllUserCourseUserIdImpl(String userId){
        return new ResponseEntity<List<UserCourse>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<UserCourse>> getAllUserCourseCourseIdImpl(String courseId){
        return new ResponseEntity<List<UserCourse>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<UserCourse>> getAllUserCourseCourseIdUserIdImpl(String courseId,String userId){
        return new ResponseEntity<List<UserCourse>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<UserCourse>> getAllUserCourseImpl(){
        return new ResponseEntity<List<UserCourse>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<UserCourse> getUserCourseIdImpl(String userCourseId){
        return new ResponseEntity<UserCourse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateUserCourseImpl(UserCourse userCourse){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	

}
