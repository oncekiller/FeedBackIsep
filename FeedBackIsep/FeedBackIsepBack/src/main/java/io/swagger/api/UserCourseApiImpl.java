package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Comment;
import io.swagger.model.UserCourse;
import io.swagger.repository.UserCourseRepo;

@Service
public class UserCourseApiImpl implements UserCourseApiDelegate {
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	UserCourseRepo userCourseRepo;
	
	@Override
	public ResponseEntity<UserCourse> addUserCourseImpl(UserCourse userCourse) {
		//Add a userCourse to the dataBase Implemented method
		try {
	        return new ResponseEntity<UserCourse>(userCourseRepo.save(userCourse),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<UserCourse>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteUserCourseImpl(String userCourseId) {
		// Delete a userCourse of the dataBase Implemented method
		try {
			if(userCourseRepo.exists(Long.parseLong(userCourseId))){
				userCourseRepo.delete(Long.parseLong(userCourseId));
			 	return new ResponseEntity<String>(HttpStatus.OK);
			}
			else {
	            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<UserCourse>> getAllUserCourseUserIdImpl(String userId) {
		// Get all the userCourses from a user
		try {
			ArrayList<UserCourse> listUserCourse = new ArrayList<UserCourse>();
			for(int i = 0; i<userCourseRepo.findAll().size(); i++) {
				if (userCourseRepo.findAll().get(i).getUserId() == Long.parseLong(userId)) {
					listUserCourse.add(userCourseRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<UserCourse>>(listUserCourse ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<UserCourse>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<UserCourse>> getAllUserCourseCourseIdImpl(String courseId) {
		// Get all the userCourses from a specific course
		try {
			ArrayList<UserCourse> listUserCourse = new ArrayList<UserCourse>();
			for(int i = 0; i<userCourseRepo.findAll().size(); i++) {
				if (userCourseRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId)) {
					listUserCourse.add(userCourseRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<UserCourse>>(listUserCourse ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<UserCourse>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<UserCourse>> getAllUserCourseCourseIdUserIdImpl(String courseId, String userId) {
		// Get all the userCourses from a user of a specific course
		try {
			ArrayList<UserCourse> listUserCourse = new ArrayList<UserCourse>();
			for(int i = 0; i<userCourseRepo.findAll().size(); i++) {
				if (userCourseRepo.findAll().get(i).getUserId() == Long.parseLong(userId) && userCourseRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId)) {
					listUserCourse.add(userCourseRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<UserCourse>>(listUserCourse ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<UserCourse>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<UserCourse>> getAllUserCourseImpl() {
		// Get all the userCourses
		try {
			return new ResponseEntity<List<UserCourse>>(userCourseRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<UserCourse>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<UserCourse> getUserCourseIdImpl(String userCourseId) {
		//Get a userCourse with its ID
		try {
			if(userCourseRepo.exists(Long.parseLong(userCourseId))){
				return new ResponseEntity<UserCourse>(userCourseRepo.findOne(Long.parseLong(userCourseId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<UserCourse>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<UserCourse>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateUserCourseImpl(UserCourse userCourse) {
		// Update a userCourse
		try {
			if(userCourseRepo.exists(userCourse.getId())){
				UserCourse newUserCourse = userCourseRepo.getOne(userCourse.getId());
				newUserCourse.setUserId(userCourse.getUserId());
				newUserCourse.setCourseId(userCourse.getCourseId());
				userCourseRepo.save(newUserCourse);
				return new ResponseEntity<String>(HttpStatus.OK);
			}else {
	            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			}	
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
