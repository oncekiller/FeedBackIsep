package io.swagger.api;

import io.swagger.model.Comment;
import io.swagger.model.Course;
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
public class CourseApiController implements CourseApi {

    private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    CourseApiDelegate courseApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public CourseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> deleteCourse(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("courseId") String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return courseApiDelegate.deleteCourseImpl(courseId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Course> getCourseId(@ApiParam(value = "Id of the course to search",required=true) @PathVariable("courseId") String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return courseApiDelegate.getCourseIdImpl(courseId);
        }
        return new ResponseEntity<Course>(HttpStatus.BAD_REQUEST);
    }
    
    public ResponseEntity<Course> addCourse(@ApiParam(value = "Course to add"  )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return courseApiDelegate.addCourseImpl(body);
        }      
        return new ResponseEntity<Course>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Course>> getAllCourses(@ApiParam(value = "Find all the courses of the users with his Id") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "Find all the courses of the teacher with his Id") @Valid @RequestParam(value = "teacherId", required = false) String teacherId,@ApiParam(value = "Find all the courses of a specific material with its id") @Valid @RequestParam(value = "materialId", required = false) String materialId) {
      	 String accept = request.getHeader("Accept");
         if (accept != null && accept.contains("application/json")) {
        	 if(userId != null && teacherId == null && materialId == null) {
        		 return courseApiDelegate.getAllCoursesUserIdImpl(userId);
             }
        	 if(userId == null && teacherId != null && materialId == null) {
        		 return courseApiDelegate.getAllCoursesTeacherIdImpl(teacherId);
             }
        	 if(userId == null && teacherId == null && materialId != null) {
        		 return courseApiDelegate.getAllCoursesMaterialIdImpl(materialId);
             }
        	 if(userId != null && teacherId != null && materialId == null) {
        		 return courseApiDelegate.getAllCoursesTeacherIdUserIdImpl(teacherId, userId);
             }
        	 if(userId == null && teacherId != null && materialId != null) {
        		 return courseApiDelegate.getAllCoursesTeacherIdMaterialIdImpl(teacherId, materialId);
             }
        	 if(userId != null && teacherId == null && materialId != null) {
        		 return courseApiDelegate.getAllCoursesMaterialIdUserIdImpl(materialId, userId);
             }
        	 if(userId != null && teacherId != null && materialId != null) {
        		 return courseApiDelegate.getAllCoursesMaterialIdUserIdTeacherIdImpl(materialId, userId, teacherId);
             }
        	 if(userId == null && teacherId == null && materialId == null) {
        		 return courseApiDelegate.getAllCoursesImpl();
             }
         }    	 
         return new ResponseEntity<List<Course>>(HttpStatus.BAD_REQUEST);    
    }

    public ResponseEntity<String> updateCourse(@ApiParam(value = "Updated course object" ,required=true )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return courseApiDelegate.updateCourseImpl(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

}
