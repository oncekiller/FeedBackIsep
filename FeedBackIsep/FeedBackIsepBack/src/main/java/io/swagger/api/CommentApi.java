/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Comment;
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
@Api(value = "comment", description = "the comment API")
public interface CommentApi {

    @ApiOperation(value = "Adds a comment", nickname = "addComment", notes = "Add a comment to the dataBase", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "comment created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing comment already exists") })
    @RequestMapping(value = "/comment",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Comment> addComment(@ApiParam(value = "Comment to add"  )  @Valid @RequestBody Comment body);


    @ApiOperation(value = "Delete a comment", nickname = "deleteComment", notes = "Delete a comment to the dataBase", response = String.class, tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid commentId supplied"),
        @ApiResponse(code = 404, message = "comment not found") })
    @RequestMapping(value = "/comment/{commentId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> deleteComment(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("commentId") String commentId);


    @ApiOperation(value = "get all comments", nickname = "getAllComments", notes = "Get comments from the dataBase ", response = Comment.class, responseContainer = "List", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Comment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid parameters supplied"),
        @ApiResponse(code = 404, message = "Comment not found") })
    @RequestMapping(value = "/comment",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Comment>> getAllComments(@ApiParam(value = "find all the comments of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "find all the comments of a course with the id of the course to search") @Valid @RequestParam(value = "courseId", required = false) String courseId);


    @ApiOperation(value = "get a comment", nickname = "getCommentId", notes = "Get a comment from the dataBase with its id ", response = Comment.class, responseContainer = "List", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Comment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid commentId supplied"),
        @ApiResponse(code = 404, message = "Comment not found") })
    @RequestMapping(value = "/comment/{commentId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Comment>> getCommentId(@ApiParam(value = "Id of the comment to search",required=true) @PathVariable("commentId") String commentId);


    @ApiOperation(value = "Update an comment", nickname = "updateComment", notes = "Update a comment of the dataBase.", response = Comment.class, tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Comment.class),
        @ApiResponse(code = 400, message = "Invalid comment supplied"),
        @ApiResponse(code = 404, message = "Comment not found") })
    @RequestMapping(value = "/comment",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Comment> updateComment(@ApiParam(value = "Updated comment object" ,required=true )  @Valid @RequestBody Comment body);

}
