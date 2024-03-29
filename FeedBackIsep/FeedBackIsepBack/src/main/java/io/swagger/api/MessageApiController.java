package io.swagger.api;

import io.swagger.model.Conversation;
import io.swagger.model.Message;
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
public class MessageApiController implements MessageApi {

    private static final Logger log = LoggerFactory.getLogger(MessageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    MessageApiDelegate messageApiDelegate;

    @org.springframework.beans.factory.annotation.Autowired
    public MessageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Message> addMessage(@ApiParam(value = "Message to add"  )  @Valid @RequestBody Message body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return messageApiDelegate.addMessageImpl(body);
        }      
        return new ResponseEntity<Message>(HttpStatus.BAD_REQUEST);
   }

    public ResponseEntity<String> deleteMessage(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("messageId") String messageId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return messageApiDelegate.deleteMessageImpl(messageId);
        }    
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Message>> getAllMessages(@ApiParam(value = "find all the message of a Conversation") @Valid @RequestParam(value = "conversationId", required = false) String conversationId) {
      	 String accept = request.getHeader("Accept");
         if (accept != null && accept.contains("application/json")) {
        	 if(conversationId != null) {
        		 return messageApiDelegate.getAllMessageConversationIdImpl(conversationId);
             }
        	 if(conversationId == null) {
            	 return messageApiDelegate.getAllMessageImpl();
        	 }        	 
         }    	 
         return new ResponseEntity<List<Message>>(HttpStatus.BAD_REQUEST);    
    }


    public ResponseEntity<Message> getMessageId(@ApiParam(value = "Id of the message to search",required=true) @PathVariable("messageId") String messageId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return messageApiDelegate.getMessageIdImpl(messageId);
        }
        return new ResponseEntity<Message>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateMessage(@ApiParam(value = "Updated message object" ,required=true )  @Valid @RequestBody Message body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return messageApiDelegate.updateMessageImpl(body);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

}
