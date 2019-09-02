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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
@Controller
public class CourseApiController implements CourseApi {

    private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CourseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> deleteCourse(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("courseId") String courseId) {
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

    public ResponseEntity<List<Course>> getCourseId(@ApiParam(value = "Id of the course to search",required=true) @PathVariable("courseId") String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Course>>(objectMapper.readValue("[ {"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"duration\" : 60,\n" + 
                		"  \"teacher_id\" : 11,\n" + 
                		"  \"material_id\" : 11,\n" + 
                		"  \"id\" : 11\n" + 
                		"}, {\n" + 
                		"  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"duration\" : 60,\n" + 
                		"  \"teacher_id\" : 11,\n" + 
                		"  \"material_id\" : 11,\n" + 
                		"  \"id\" : 11"
                		+ "} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
