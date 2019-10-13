package io.swagger.api;

import io.swagger.model.Comment;
import io.swagger.model.Conversation;
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
public class ConversationApiController implements ConversationApi {

    private static final Logger log = LoggerFactory.getLogger(ConversationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    ConversationApiDelegate conversationApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public ConversationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Conversation> addConversation(@ApiParam(value = "conversation to add"  )  @Valid @RequestBody Conversation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return conversationApiDelegate.addConversationImpl(body);
        }      
        return new ResponseEntity<Conversation>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteConversation(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("conversationId") String conversationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return conversationApiDelegate.deleteConversationImpl(conversationId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Conversation>> getAllConversations(@ApiParam(value = "find all the conversations of a user with the id of the user to search") @Valid @RequestParam(value = "userId", required = false) String userId) {
   	 String accept = request.getHeader("Accept");
     if (accept != null && accept.contains("application/json")) {
    	 if(userId != null) {
    		 return conversationApiDelegate.getAllConversationsUserIdImpl(userId);
         }
    	 if(userId == null) {
        	 return conversationApiDelegate.getAllConversationsImpl();
    	 }        	 
     }    	 
     return new ResponseEntity<List<Conversation>>(HttpStatus.BAD_REQUEST);    
    }

    public ResponseEntity<Conversation> getConversationId(@ApiParam(value = "Id of the conversation to search",required=true) @PathVariable("conversationId") String conversationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return conversationApiDelegate.getConversationIdImpl(conversationId);
        }
        return new ResponseEntity<Conversation>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateConversation(@ApiParam(value = "Updated conversation object" ,required=true )  @Valid @RequestBody Conversation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return conversationApiDelegate.updateConversationImpl(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

}
