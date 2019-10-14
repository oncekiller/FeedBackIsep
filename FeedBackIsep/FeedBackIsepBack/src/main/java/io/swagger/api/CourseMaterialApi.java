
package io.swagger.api;

import io.swagger.model.CourseMaterial;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T03:38:36.462Z[GMT]")
@Api(value = "courseMaterial", description = "the courseMaterial API")
public interface CourseMaterialApi {

    @ApiOperation(value = "Adds a courseMaterial", nickname = "addCourseMaterial", notes = "Add a courseMaterial to the dataBase", tags={ "courseMaterial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "courseMaterial created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing courseMaterial already exists") })
    @RequestMapping(value = "/courseMaterial",
    	produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CourseMaterial> addCourseMaterial(@ApiParam(value = "courseMaterial to add"  )  @Valid @RequestBody CourseMaterial body);


    @ApiOperation(value = "Delete a courseMaterial", nickname = "deleteCourseMaterial", notes = "Delete a courseMaterial to the dataBase", response = String.class, tags={ "courseMaterial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid courseMaterialId supplied"),
        @ApiResponse(code = 404, message = "courseMaterial not found") })
    @RequestMapping(value = "/courseMaterial/{courseMaterialId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> deleteCourseMaterial(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("courseMaterialId") String courseMaterialId);


    @ApiOperation(value = "get all courseMaterial", nickname = "getAllCourseMaterial", notes = "Get courseMaterial from the dataBase ", response = CourseMaterial.class, responseContainer = "List", tags={ "courseMaterial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = CourseMaterial.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid parameters supplied"),
        @ApiResponse(code = 404, message = "CourseMaterial not found") })
    @RequestMapping(value = "/courseMaterial",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CourseMaterial>> getAllCourseMaterial();


    @ApiOperation(value = "get a courseMaterial", nickname = "getCourseMaterialId", notes = "Get a courseMaterial from the dataBase with its id ", response = CourseMaterial.class, responseContainer = "List", tags={ "courseMaterial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = CourseMaterial.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid courseMaterialId supplied"),
        @ApiResponse(code = 404, message = "CourseMaterial not found") })
    @RequestMapping(value = "/courseMaterial/{courseMaterialId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<CourseMaterial> getCourseMaterialId(@ApiParam(value = "Id of the courseMaterial to search",required=true) @PathVariable("courseMaterialId") String courseMaterialId);


    @ApiOperation(value = "Update an courseMaterial", nickname = "updateCourseMaterial", notes = "Update a courseMaterial of the dataBase.", response = CourseMaterial.class, tags={ "courseMaterial", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CourseMaterial.class),
        @ApiResponse(code = 400, message = "Invalid courseMaterial supplied"),
        @ApiResponse(code = 404, message = "CourseMaterial not found") })
    @RequestMapping(value = "/courseMaterial",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<String> updateCourseMaterial(@ApiParam(value = "Updated courseMaterial object" ,required=true )  @Valid @RequestBody CourseMaterial body);

}
