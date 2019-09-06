package io.swagger.api;

import io.swagger.model.Course;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T03:38:36.462Z[GMT]")
@Controller
public class CoursesApiController implements CoursesApi {

    private static final Logger log = LoggerFactory.getLogger(CoursesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CoursesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addCourse(@ApiParam(value = "Course to add"  )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Course>> getAllCourses(@ApiParam(value = "Find all the courses of the users with his Id") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "Find all the courses of the teacher with his Id") @Valid @RequestParam(value = "teacherId", required = false) String teacherId,@ApiParam(value = "Find all the courses of a specific material with its id") @Valid @RequestParam(value = "materialId", required = false) String materialId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Course>>(objectMapper.readValue("[ {\n  \"duration\" : 60,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"teacher_id\" : 11,\n  \"material_id\" : 11,\n  \"id\" : 11\n}, {\n  \"duration\" : 60,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"teacher_id\" : 11,\n  \"material_id\" : 11,\n  \"id\" : 11\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> updateCourse(@ApiParam(value = "Updated course object" ,required=true )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"duration\" : 60,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"teacher_id\" : 11,\n  \"material_id\" : 11,\n  \"id\" : 11\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

}
