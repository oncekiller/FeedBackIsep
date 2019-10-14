package io.swagger.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Course;
import io.swagger.model.CourseMaterial;
import io.swagger.repository.CourseMaterialRepo;

@Service
public class CourseMaterialApiImpl implements CourseMaterialApiDelegate{

	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	CourseMaterialRepo courseMaterialRepo;
	
	@Override
	public ResponseEntity<CourseMaterial> addCourseMaterialImpl(CourseMaterial courseMaterial) {
		//Add a courseMaterial to the dataBase Implemented method
		try {
	        return new ResponseEntity<CourseMaterial>(courseMaterialRepo.save(courseMaterial),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<CourseMaterial>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteCourseMaterialImpl(String courseMaterialId) {
		// Delete a courseMaterial of the dataBase Implemented method
		try {
			if(courseMaterialRepo.exists(Long.parseLong(courseMaterialId))){
				courseMaterialRepo.delete(Long.parseLong(courseMaterialId));
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
	public ResponseEntity<List<CourseMaterial>> getAllCourseMaterialImpl() {
		// Get all the courseMaterial
		try {
			return new ResponseEntity<List<CourseMaterial>>(courseMaterialRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<CourseMaterial>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<CourseMaterial> getCourseMaterialIdImpl(String courseMaterialId) {
		//Get a courseMaterial with its ID
		try {
			if(courseMaterialRepo.exists(Long.parseLong(courseMaterialId))){
				return new ResponseEntity<CourseMaterial>(courseMaterialRepo.findOne(Long.parseLong(courseMaterialId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<CourseMaterial>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<CourseMaterial>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateCourseMaterialImpl(CourseMaterial courseMaterial) {
		// Update a courseMaterial
		try {
			if(courseMaterialRepo.exists(courseMaterial.getId())){
				CourseMaterial newCourseMaterial = courseMaterialRepo.getOne(courseMaterial.getId());
				newCourseMaterial.setName(courseMaterial.getName());
				courseMaterialRepo.save(newCourseMaterial);
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
