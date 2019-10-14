package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Course;
import io.swagger.model.CourseDocument;
import io.swagger.repository.CourseDocumentRepo;

@Service
public class CourseDocumentApiImpl implements CourseDocumentApiDelegate{

	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	CourseDocumentRepo courseDocumentRepo;
	
	@Override
	public ResponseEntity<CourseDocument> addCourseDocumentImpl(CourseDocument courseDocument) {
		//Add a courseDocument to the dataBase Implemented method
		try {
	        return new ResponseEntity<CourseDocument>(courseDocumentRepo.save(courseDocument),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<CourseDocument>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteCourseDocumentImpl(String courseDocumentId) {
		// Delete a courseDocument of the dataBase Implemented method
		try {
			if(courseDocumentRepo.exists(Long.parseLong(courseDocumentId))){
				courseDocumentRepo.delete(Long.parseLong(courseDocumentId));
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
	public ResponseEntity<List<CourseDocument>> getAllCourseDocumentCourseIdImpl(String courseId) {
		// Get all the courseDocuments of a course
		try {
			ArrayList<CourseDocument> listCourseDocument = new ArrayList<CourseDocument>();
			for(int i = 0; i<courseDocumentRepo.findAll().size(); i++) {
				if (courseDocumentRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId)) {
					listCourseDocument.add(courseDocumentRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<CourseDocument>>(listCourseDocument ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<CourseDocument>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	public ResponseEntity<List<CourseDocument>> getAllCourseDocumentUserPostIdImpl(String userPostId) {
		// Get all the courseDocuments of a user
		try {
			ArrayList<CourseDocument> listCourseDocument = new ArrayList<CourseDocument>();
			for(int i = 0; i<courseDocumentRepo.findAll().size(); i++) {
				if (courseDocumentRepo.findAll().get(i).getUserPostId() == Long.parseLong(userPostId)) {
					listCourseDocument.add(courseDocumentRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<CourseDocument>>(listCourseDocument ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<CourseDocument>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<CourseDocument>> getAllCourseDocumentUserPostIdCourseIdImpl(String userPostId , String courseId) {
		// Get all the courseDocuments of a user of a specific course
		try {
			ArrayList<CourseDocument> listCourseDocument = new ArrayList<CourseDocument>();
			for(int i = 0; i<courseDocumentRepo.findAll().size(); i++) {
				if (courseDocumentRepo.findAll().get(i).getUserPostId() == Long.parseLong(userPostId) && courseDocumentRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId)) {
					listCourseDocument.add(courseDocumentRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<CourseDocument>>(listCourseDocument ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<CourseDocument>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<CourseDocument>> getAllCourseDocumentImpl() {
		// Get all the courseDocument
		try {
			return new ResponseEntity<List<CourseDocument>>(courseDocumentRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<CourseDocument>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<CourseDocument> getCourseDocumentIdImpl(String courseDocumentId) {
		//Get a courseDocument with its ID
		try {
			if(courseDocumentRepo.exists(Long.parseLong(courseDocumentId))){
				return new ResponseEntity<CourseDocument>(courseDocumentRepo.findOne(Long.parseLong(courseDocumentId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<CourseDocument>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<CourseDocument>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateCourseDocumentImpl(CourseDocument courseDocument) {
		// Update a courseDocument
		try {
			if(courseDocumentRepo.exists(courseDocument.getId())){
				CourseDocument newCourseDocument = courseDocumentRepo.getOne(courseDocument.getId());
				newCourseDocument.setName(courseDocument.getName());
				newCourseDocument.setDocument(courseDocument.getDocument());
				newCourseDocument.setUserPostId(courseDocument.getUserPostId());
				newCourseDocument.setCourseId(courseDocument.getCourseId());
				courseDocumentRepo.save(newCourseDocument);
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
