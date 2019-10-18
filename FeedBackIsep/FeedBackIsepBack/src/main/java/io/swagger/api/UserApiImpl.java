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
import io.swagger.model.User;
import io.swagger.repository.UserRepo;

@Service
public class UserApiImpl implements UserApiDelegate {
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	UserRepo userRepo;

	@Override
	public ResponseEntity<User> addUserImpl(User user) {
		//Add a user to the dataBase Implemented method
		try {
	        return new ResponseEntity<User>(userRepo.save(user),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteUserImpl(String userId) {
		// Delete a user of the dataBase Implemented method
		try {
			if(userRepo.exists(Long.parseLong(userId))){
				userRepo.delete(Long.parseLong(userId));
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
	public ResponseEntity<List<User>> getUserIsepIdImpl(String isepId) {
		// Get a user with his isepId
		try {
			ArrayList<User> listUser = new ArrayList<User>();
			for(int i = 0; i<userRepo.findAll().size(); i++) {
				if (userRepo.findAll().get(i).getIsepId() == Long.parseLong(isepId)) {
					listUser.add(userRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<User>>(listUser ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<User>> getAllUserImpl() {
		// Get all the users
		try {
			return new ResponseEntity<List<User>>(userRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<User> getUserIdImpl(String userId) {
		//Get a user with its ID
		try {
			if(userRepo.exists(Long.parseLong(userId))){
				return new ResponseEntity<User>(userRepo.findOne(Long.parseLong(userId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateUserImpl(User user) {
		// Update a user
		try {
			if(userRepo.exists(user.getId())){
				User newUser = userRepo.getOne(user.getId());
				newUser.setUsername(user.getUsername());
				newUser.setFirstname(user.getFirstname());
				newUser.setLastname(user.getLastname());
				newUser.setStatus(user.getStatus());
				newUser.setIsepId(user.getIsepId());
				newUser.setMail(user.getMail());
				newUser.setPassword(user.getPassword());
				newUser.setAvatar(user.getAvatar());
				newUser.setColor(user.getColor());
				newUser.setParentId(user.getParentId());
				newUser.setEnabled(user.isEnabled());
				userRepo.save(newUser);
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
