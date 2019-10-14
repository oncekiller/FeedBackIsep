package io.swagger.api;

import io.swagger.model.CourseDocument;
import io.swagger.model.CourseMaterial;
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
public class CourseMaterialApiController implements CourseMaterialApi {

    private static final Logger log = LoggerFactory.getLogger(CourseMaterialApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    CourseMaterialApiDelegate courseMaterialApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public CourseMaterialApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CourseMaterial> addCourseMaterial(@ApiParam(value = "courseMaterial to add"  )  @Valid @RequestBody CourseMaterial body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return courseMaterialApiDelegate.addCourseMaterialImpl(body);
        }      
        return new ResponseEntity<CourseMaterial>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteCourseMaterial(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("courseMaterialId") String courseMaterialId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return courseMaterialApiDelegate.deleteCourseMaterialImpl(courseMaterialId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }
   
    public ResponseEntity<List<CourseMaterial>> getAllCourseMaterial() {
      	 String accept = request.getHeader("Accept");
         if (accept != null && accept.contains("application/json")) {
        	
        		 return courseMaterialApiDelegate.getAllCourseMaterialImpl();
             
         }    	 
         return new ResponseEntity<List<CourseMaterial>>(HttpStatus.BAD_REQUEST);    
    }


    public ResponseEntity<CourseMaterial> getCourseMaterialId(@ApiParam(value = "Id of the courseMaterial to search",required=true) @PathVariable("courseMaterialId") String courseMaterialId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return courseMaterialApiDelegate.getCourseMaterialIdImpl(courseMaterialId);
        }
        return new ResponseEntity<CourseMaterial>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateCourseMaterial(@ApiParam(value = "Updated courseMaterial object" ,required=true )  @Valid @RequestBody CourseMaterial body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return courseMaterialApiDelegate.updateCourseMaterialImpl(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

	

}
