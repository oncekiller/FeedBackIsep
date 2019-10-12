package io.swagger.api;

import io.swagger.model.Comment;
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
public class CommentApiController implements CommentApi {

    private static final Logger log = LoggerFactory.getLogger(CommentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    CommentApiDelegate commentApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public CommentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Comment> addComment(@ApiParam(value = "Comment to add"  )  @Valid @RequestBody Comment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return commentApiDelegate.addCommentImpl(body);
        }      
        return new ResponseEntity<Comment>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteComment(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("commentId") String commentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return commentApiDelegate.deleteCommentImpl(commentId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Comment>> getAllComments(@ApiParam(value = "find all the comments of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "find all the comments of a course with the id of the course to search") @Valid @RequestParam(value = "courseId", required = false) String courseId) {
    	 String accept = request.getHeader("Accept");
         if (accept != null && accept.contains("application/json")) {
        	 if(courseId != null && userId == null) {
        		 return commentApiDelegate.getAllCommentsCourseIdImpl(courseId);
             }
        	 if(userId != null && courseId == null) {
        		 return commentApiDelegate.getAllCommentsUserIdImpl(userId);
             }
        	 if(userId != null && courseId != null) {
        		 return commentApiDelegate.getAllCommentsCourseIdUserIdImpl(courseId,userId);
        	 }
        	 if(userId == null && courseId == null) {
            	 return commentApiDelegate.getAllCommentsImpl();
        	 }        	 
         }    	 
         return new ResponseEntity<List<Comment>>(HttpStatus.BAD_REQUEST);    
    }

    public ResponseEntity<Comment> getCommentId(@ApiParam(value = "Id of the comment to search",required=true) @PathVariable("commentId") String commentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return commentApiDelegate.getCommentIdImpl(commentId);
        }
        return new ResponseEntity<Comment>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateComment(@ApiParam(value = "Updated comment object" ,required=true )  @Valid @RequestBody Comment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return commentApiDelegate.updateComment(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

}
