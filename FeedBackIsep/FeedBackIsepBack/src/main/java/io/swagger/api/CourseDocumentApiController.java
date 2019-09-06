package io.swagger.api;

import io.swagger.model.CourseDocument;
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
public class CourseDocumentApiController implements CourseDocumentApi {

    private static final Logger log = LoggerFactory.getLogger(CourseDocumentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CourseDocumentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addCourseDocument(@ApiParam(value = "courseDocument to add"  )  @Valid @RequestBody CourseDocument body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteCourseDocument(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("courseDocumentId") String courseDocumentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CourseDocument>> getAllCourseDocument(@ApiParam(value = "find all the courseDocument of a user who post the document with the id of the user to search") @Valid @RequestParam(value = "userPostId", required = false) String userPostId,@ApiParam(value = "find all the courseDocument of a course with the id of the course to search") @Valid @RequestParam(value = "courseId", required = false) String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CourseDocument>>(objectMapper.readValue("[ {\n  \"course_id\" : 11,\n  \"document\" : \"./documentLink\",\n  \"name\" : \"documentName\",\n  \"id\" : 11,\n  \"userPost_id\" : 11\n}, {\n  \"course_id\" : 11,\n  \"document\" : \"./documentLink\",\n  \"name\" : \"documentName\",\n  \"id\" : 11,\n  \"userPost_id\" : 11\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CourseDocument>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CourseDocument>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CourseDocument>> getCourseDocumentId(@ApiParam(value = "Id of the courseDocument to search",required=true) @PathVariable("courseDocumentId") String courseDocumentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CourseDocument>>(objectMapper.readValue("[ {\n  \"course_id\" : 11,\n  \"document\" : \"./documentLink\",\n  \"name\" : \"documentName\",\n  \"id\" : 11,\n  \"userPost_id\" : 11\n}, {\n  \"course_id\" : 11,\n  \"document\" : \"./documentLink\",\n  \"name\" : \"documentName\",\n  \"id\" : 11,\n  \"userPost_id\" : 11\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CourseDocument>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CourseDocument>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CourseDocument> updateCourseDocument(@ApiParam(value = "Updated courseDocument object" ,required=true )  @Valid @RequestBody CourseDocument body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CourseDocument>(objectMapper.readValue("{\n  \"course_id\" : 11,\n  \"document\" : \"./documentLink\",\n  \"name\" : \"documentName\",\n  \"id\" : 11,\n  \"userPost_id\" : 11\n}", CourseDocument.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CourseDocument>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CourseDocument>(HttpStatus.NOT_IMPLEMENTED);
    }

}
