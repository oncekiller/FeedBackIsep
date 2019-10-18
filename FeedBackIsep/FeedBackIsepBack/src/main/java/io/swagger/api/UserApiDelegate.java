package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.User;

public interface UserApiDelegate {
	
	default ResponseEntity<User> addUserImpl(User user) {
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteUserImpl(String userId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<User>> getUserIsepIdImpl(String isepId){
        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<User>> getAllUserImpl(){
        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<User> getUserIdImpl(String userId){
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateUserImpl(User user){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}



}
