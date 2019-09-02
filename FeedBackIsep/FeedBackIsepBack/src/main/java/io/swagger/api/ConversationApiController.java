package io.swagger.api;

import io.swagger.model.Conversation;
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
public class ConversationApiController implements ConversationApi {

    private static final Logger log = LoggerFactory.getLogger(ConversationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConversationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addConversation(@ApiParam(value = "conversation to add"  )  @Valid @RequestBody Conversation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteConversation(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("conversationId") String conversationId) {
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

    public ResponseEntity<List<Conversation>> getAllConversations(@ApiParam(value = "find all the conversations of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Conversation>>(objectMapper.readValue("[ {"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"from_id\" : 11,\n" + 
                		"  \"to_id\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"object\" : \"This is the object of the conversation\"\n" + 
                		"}, {\n" + 
                		"  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"from_id\" : 11,\n" + 
                		"  \"to_id\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"object\" : \"This is the object of the conversation\"\n" + 
                		"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Conversation>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Conversation>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Conversation>> getConversationId(@ApiParam(value = "Id of the conversation to search",required=true) @PathVariable("conversationId") String conversationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Conversation>>(objectMapper.readValue("[ {"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"from_id\" : 11,\n" + 
                		"  \"to_id\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"object\" : \"This is the object of the conversation\"\n" + 
                		"}, {\n" + 
                		"  \"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"from_id\" : 11,\n" + 
                		"  \"to_id\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"object\" : \"This is the object of the conversation\"\n" + 
                		"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Conversation>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Conversation>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Conversation> updateConversation(@ApiParam(value = "Updated conversation object" ,required=true )  @Valid @RequestBody Conversation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Conversation>(objectMapper.readValue("{"
                		+ "\"dateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n" + 
                		"  \"from_id\" : 11,\n" + 
                		"  \"to_id\" : 11,\n" + 
                		"  \"id\" : 11,\n" + 
                		"  \"object\" : \"This is the object of the conversation\"\n" + 
                		"}", Conversation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Conversation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Conversation>(HttpStatus.NOT_IMPLEMENTED);
    }

}
