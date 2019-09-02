package io.swagger.api;

import io.swagger.model.Comment;
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
public class CommentApiController implements CommentApi {

    private static final Logger log = LoggerFactory.getLogger(CommentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CommentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addComment(@ApiParam(value = "Comment to add"  )  @Valid @RequestBody Comment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteComment(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("commentId") String commentId) {
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

    public ResponseEntity<List<Comment>> getAllComments(@ApiParam(value = "find all the comments of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId,@ApiParam(value = "find all the comments of a course with the id of the course to search") @Valid @RequestParam(value = "courseId", required = false) String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Comment>>(objectMapper.readValue("[ {"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"course_id\" : 11,\n" + 
                		"  \"user_id\" : 11,\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"number_like\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"number_dislike\" : 11,\n" + 
                		"  \"content\" : \"this is the content of a comment\"\n" + 
                		"}, {\n" + 
                		"  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"course_id\" : 11,\n" + 
                		"  \"user_id\" : 11,\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"number_like\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"number_dislike\" : 11,\n" + 
                		"  \"content\" : \"this is the content of a comment\"\n" + 
                		"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Comment>> getCommentId(@ApiParam(value = "Id of the comment to search",required=true) @PathVariable("commentId") String commentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Comment>>(objectMapper.readValue("[ {"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"course_id\" : 11,\n" + 
                		"  \"user_id\" : 11,\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"number_like\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"number_dislike\" : 11,\n" + 
                		"  \"content\" : \"this is the content of a comment\"\n" + 
                		"}, {\n" + 
                		"  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"course_id\" : 11,\n" + 
                		"  \"user_id\" : 11,\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"number_like\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"number_dislike\" : 11,\n" + 
                		"  \"content\" : \"this is the content of a comment\"\n" + 
                		"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Comment> updateComment(@ApiParam(value = "Updated comment object" ,required=true )  @Valid @RequestBody Comment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Comment>(objectMapper.readValue("{"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"course_id\" : 11,\n" + 
                		"  \"user_id\" : 11,\n" + 
                		"  \"parent_id\" : 11,\n" + 
                		"  \"number_like\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"number_dislike\" : 11,\n" + 
                		"  \"content\" : \"this is the content of a comment\"\n" + 
                		"}", Comment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Comment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Comment>(HttpStatus.NOT_IMPLEMENTED);
    }

}
