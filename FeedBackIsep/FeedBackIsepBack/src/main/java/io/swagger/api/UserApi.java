/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
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
@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Adds a user", nickname = "addUser", notes = "Add a user to the dataBase", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "user created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing user already exists") })
    @RequestMapping(value = "/user",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<User> addUser(@ApiParam(value = "User to add"  )  @Valid @RequestBody User body);


    @ApiOperation(value = "Delete a user", nickname = "deleteUser", notes = "Delete a user to the dataBase", response = String.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid userId supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> deleteUser(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "get all users", nickname = "getAllUsers", notes = "Get users from the dataBase ", response = User.class, responseContainer = "List", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid isepId supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getAllUsers(@ApiParam(value = "Isep id of the user to search") @Valid @RequestParam(value = "isepId", required = false) String isepId);


    @ApiOperation(value = "get a user", nickname = "getUserId", notes = "Get a user from the dataBase with his id ", response = User.class, responseContainer = "List", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid userId supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{userId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserId(@ApiParam(value = "Id of the user to search",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "Update an user", nickname = "updateUser", notes = "This can only be done by the logged in user.", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<String> updateUser(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body);

}
