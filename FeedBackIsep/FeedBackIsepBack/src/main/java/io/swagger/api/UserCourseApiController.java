package io.swagger.api;

import io.swagger.model.Comment;
import io.swagger.model.UserCourse;
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
public class UserCourseApiController implements UserCourseApi {

    private static final Logger log = LoggerFactory.getLogger(UserCourseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    UserCourseApiDelegate userCourseApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public UserCourseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UserCourse> addUserCourse(@ApiParam(value = "userCourse to add"  )  @Valid @RequestBody UserCourse body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return userCourseApiDelegate.addUserCourseImpl(body);
        }      
        return new ResponseEntity<UserCourse>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteUserCourse(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("userCourseId") String userCourseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return userCourseApiDelegate.deleteUserCourseImpl(userCourseId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<UserCourse>> getAllUserCourse(@ApiParam(value = "find all the userCourse of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "find all the userCourse of a course with the id of the course to search") @Valid @RequestParam(value = "courseId", required = false) String courseId) {
   	 String accept = request.getHeader("Accept");
     if (accept != null && accept.contains("application/json")) {
    	 if(courseId != null && userId == null) {
    		 return userCourseApiDelegate.getAllUserCourseCourseIdImpl(courseId);
         }
    	 if(userId != null && courseId == null) {
    		 return userCourseApiDelegate.getAllUserCourseUserIdImpl(userId);
         }
    	 if(userId != null && courseId != null) {
    		 return userCourseApiDelegate.getAllUserCourseCourseIdUserIdImpl(courseId,userId);
    	 }
    	 if(userId == null && courseId == null) {
        	 return userCourseApiDelegate.getAllUserCourseImpl();
    	 }        	 
     }    	 
     return new ResponseEntity<List<UserCourse>>(HttpStatus.BAD_REQUEST);    
    }

    public ResponseEntity<UserCourse> getUserCourseId(@ApiParam(value = "Id of the userCourse to search",required=true) @PathVariable("userCourseId") String userCourseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return userCourseApiDelegate.getUserCourseIdImpl(userCourseId);
        }
        return new ResponseEntity<UserCourse>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateUserCourse(@ApiParam(value = "Updated userCourse object" ,required=true )  @Valid @RequestBody UserCourse body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return userCourseApiDelegate.updateUserCourseImpl(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

}
