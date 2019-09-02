/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Course;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-01T00:52:54.999Z[GMT]")
@Api(value = "course", description = "the course API")
public interface CourseApi {

    @ApiOperation(value = "Delete a course", nickname = "deleteCourse", notes = "Delete a course to the dataBase", response = String.class, tags={ "course", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid courseId supplied"),
        @ApiResponse(code = 404, message = "Course not found") })
    @RequestMapping(value = "/course/{courseId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> deleteCourse(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("courseId") String courseId);


    @ApiOperation(value = "get a course", nickname = "getCourseId", notes = "Get a course from the dataBase with his id ", response = Course.class, responseContainer = "List", tags={ "course", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Course.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid courseId supplied"),
        @ApiResponse(code = 404, message = "Course not found") })
    @RequestMapping(value = "/course/{courseId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> getCourseId(@ApiParam(value = "Id of the course to search",required=true) @PathVariable("courseId") String courseId);

}
