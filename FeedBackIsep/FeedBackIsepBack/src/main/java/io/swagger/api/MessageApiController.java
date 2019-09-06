package io.swagger.api;

import io.swagger.model.Message;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T03:38:36.462Z[GMT]")
@Controller
public class MessageApiController implements MessageApi {

    private static final Logger log = LoggerFactory.getLogger(MessageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MessageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMessage(@ApiParam(value = "Message to add"  )  @Valid @RequestBody Message body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteMessage(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("messageId") String messageId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Message>> getAllMessages(@ApiParam(value = "find all the message of a Conversation") @Valid @RequestParam(value = "conversationId", required = false) String conversationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Message>>(objectMapper.readValue("[ {\n  \"is_read\" : true,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"conversation_id\" : 11,\n  \"is_from_sender\" : true,\n  \"id\" : 11,\n  \"content\" : \"this is the content of the message\"\n}, {\n  \"is_read\" : true,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"conversation_id\" : 11,\n  \"is_from_sender\" : true,\n  \"id\" : 11,\n  \"content\" : \"this is the content of the message\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Message>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Message>> getMessageId(@ApiParam(value = "Id of the message to search",required=true) @PathVariable("messageId") String messageId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Message>>(objectMapper.readValue("[ {\n  \"is_read\" : true,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"conversation_id\" : 11,\n  \"is_from_sender\" : true,\n  \"id\" : 11,\n  \"content\" : \"this is the content of the message\"\n}, {\n  \"is_read\" : true,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"conversation_id\" : 11,\n  \"is_from_sender\" : true,\n  \"id\" : 11,\n  \"content\" : \"this is the content of the message\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Message>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Message> updateMessage(@ApiParam(value = "Updated message object" ,required=true )  @Valid @RequestBody Message body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Message>(objectMapper.readValue("{\n  \"is_read\" : true,\n  \"date_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"conversation_id\" : 11,\n  \"is_from_sender\" : true,\n  \"id\" : 11,\n  \"content\" : \"this is the content of the message\"\n}", Message.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Message>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Message>(HttpStatus.NOT_IMPLEMENTED);
    }

}
