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
import io.swagger.model.Course;
import io.swagger.repository.CourseRepo;

@Service
public class CourseApiImpl implements CourseApiDelegate{
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	CourseRepo courseRepo;

	@Override
	public ResponseEntity<Course> addCourseImpl(Course course) {
		//Add a course to the dataBase Implemented method
		try {
	        return new ResponseEntity<Course>(courseRepo.save(course),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteCourseImpl(String courseId) {
		// Delete a course of the dataBase Implemented method
		try {
			if(courseRepo.exists(Long.parseLong(courseId))){
				courseRepo.delete(Long.parseLong(courseId));
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
	public ResponseEntity<List<Course>> getAllCoursesUserIdImpl(String userId) {
		/*// Get all the courses from a user
		try {
			ArrayList<Course> listCourse = new ArrayList<Course>();
			for(int i = 0; i<courseRepo.findAll().size(); i++) {
				if (courseRepo.findAll().get(i).getUserId() == Long.parseLong(userId)) {
					listComment.add(commentRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<Comment>>(listComment ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}*/
		return null;
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesTeacherIdImpl(String teacherId) {
		// Get all the courses from a teacher
		try {
			ArrayList<Course> listCourse = new ArrayList<Course>();
			for(int i = 0; i<courseRepo.findAll().size(); i++) {
				if (courseRepo.findAll().get(i).getTeacherId() == Long.parseLong(teacherId)) {
					listCourse.add(courseRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<Course>>(listCourse ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesMaterialIdImpl(String materialId) {
		// Get all the courses of a material
		try {
			ArrayList<Course> listCourse = new ArrayList<Course>();
			for(int i = 0; i<courseRepo.findAll().size(); i++) {
				if (courseRepo.findAll().get(i).getMaterialId() == Long.parseLong(materialId)) {
					listCourse.add(courseRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<Course>>(listCourse ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesTeacherIdUserIdImpl(String teacherId, String userId) {
		/*// Get all the courses of a user with a specific teacher
		try {
			ArrayList<Comment> listComment = new ArrayList<Comment>();
			for(int i = 0; i<commentRepo.findAll().size(); i++) {
				if (commentRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId) && commentRepo.findAll().get(i).getUserId() == Long.parseLong(userId)) {
					listComment.add(commentRepo.findAll().get(i));
				}
			}
			return new ResponseEntity<List<Comment>>(listComment ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}*/
		return null;
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesTeacherIdMaterialIdImpl(String teacherId, String materialId) {
		// Get all the courses of a teacher for a specific material
		try {
			ArrayList<Course> listCourse = new ArrayList<Course>();
			for(int i = 0; i<courseRepo.findAll().size(); i++) {
				if (courseRepo.findAll().get(i).getTeacherId() == Long.parseLong(teacherId) && courseRepo.findAll().get(i).getMaterialId() == Long.parseLong(materialId)) {
					listCourse.add(courseRepo.findAll().get(i));
				}
			}
			return new ResponseEntity<List<Course>>(listCourse ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesMaterialIdUserIdImpl(String materialId, String userId) {
		// TODO Auto-generated method stub
		return CourseApiDelegate.super.getAllCoursesMaterialIdUserIdImpl(materialId, userId);
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesMaterialIdUserIdTeacherIdImpl(String materialId, String userId, String teacherId) {
		/*// Get all the courses of a user with a specific teacher and a specific material
		try {
			ArrayList<Course> listCourse = new ArrayList<Course>();
			for(int i = 0; i<commentRepo.findAll().size(); i++) {
				if (commentRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId) && commentRepo.findAll().get(i).getUserId() == Long.parseLong(userId)) {
					listComment.add(commentRepo.findAll().get(i));
				}
			}
			return new ResponseEntity<List<Comment>>(listComment ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}*/
		return null;
	}

	@Override
	public ResponseEntity<List<Course>> getAllCoursesImpl() {
		// Get all the courses
		try {
			return new ResponseEntity<List<Course>>(courseRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Course> getCourseIdImpl(String courseId) {
		//Get a course with its ID
		try {
			if(courseRepo.exists(Long.parseLong(courseId))){
				return new ResponseEntity<Course>(courseRepo.findOne(Long.parseLong(courseId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<Course>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateCourseImpl(Course course) {
		// Update a course
		try {
			if(courseRepo.exists(course.getId())){
				Course newCourse = courseRepo.getOne(course.getId());
				newCourse.setTeacherId(course.getTeacherId());
				newCourse.setDateTime(course.getDateTime());
				newCourse.setDuration(course.getDuration());
				newCourse.setMaterialId(course.getMaterialId());
				courseRepo.save(newCourse);
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
