package io.swagger.api;

import io.swagger.model.Conversation;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T03:38:36.462Z[GMT]")
@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    UserApiDelegate userApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> addUser(@ApiParam(value = "User to add"  )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return userApiDelegate.addUserImpl(body);
        }      
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteUser(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return userApiDelegate.deleteUserImpl(userId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<User>> getAllUsers(@ApiParam(value = "Isep id of the user to search") @Valid @RequestParam(value = "isepId", required = false) String isepId) {
    	String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
       	 if(isepId != null) {
       		 return userApiDelegate.getUserIsepIdImpl(isepId);
            }
       	 if(isepId == null) {
           	 return userApiDelegate.getAllUserImpl();
       	 }        	 
        }    	 
        return new ResponseEntity<List<User>>(HttpStatus.BAD_REQUEST);    
       }

    public ResponseEntity<User> getUserId(@ApiParam(value = "Id of the user to search",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return userApiDelegate.getUserIdImpl(userId);
        }
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateUser(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return userApiDelegate.updateUserImpl(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

}
