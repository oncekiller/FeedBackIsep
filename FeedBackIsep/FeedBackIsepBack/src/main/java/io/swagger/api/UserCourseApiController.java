package io.swagger.api;

import io.swagger.model.UserCourse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
@Controller
public class UserCourseApiController implements UserCourseApi {

    private static final Logger log = LoggerFactory.getLogger(UserCourseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserCourseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addUserCourse(@ApiParam(value = "userCourse to add"  )  @Valid @RequestBody UserCourse body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteUserCourse(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("userCourseId") String userCourseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("''", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserCourse>> getAllUserCourse(@ApiParam(value = "find all the userCourse of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "find all the userCourse of a course with the id of the course to search") @Valid @RequestParam(value = "courseId", required = false) String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserCourse>>(objectMapper.readValue("[ {"
                		+ " \"course_id\" : \"11\",\n" + 
                		"  \"user_id\" : \"11\",\n" + 
                		"  \"id\" : 11\n" + 
                		"}, {\n" + 
                		"  \"course_id\" : \"11\",\n" + 
                		"  \"user_id\" : \"11\",\n" + 
                		"  \"id\" : 11} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserCourse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserCourse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserCourse>> getUserCourseId(@ApiParam(value = "Id of the userCourse to search",required=true) @PathVariable("userCourseId") String userCourseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserCourse>>(objectMapper.readValue("[ {"
                		+ "\"course_id\" : \"11\",\n" + 
                		"  \"user_id\" : \"11\",\n" + 
                		"  \"id\" : 11\n" + 
                		"}, {\n" + 
                		"  \"course_id\" : \"11\",\n" + 
                		"  \"user_id\" : \"11\",\n" + 
                		"  \"id\" : 11} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserCourse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserCourse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserCourse> updateUserCourse(@ApiParam(value = "Updated userCourse object" ,required=true )  @Valid @RequestBody UserCourse body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserCourse>(objectMapper.readValue("{"
                		+ "\"course_id\" : \"11\",\n" + 
                		"  \"user_id\" : \"11\",\n" + 
                		"  \"id\" : 11"
                		+ "}", UserCourse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserCourse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserCourse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
