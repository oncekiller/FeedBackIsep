/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Message;
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
@Api(value = "message", description = "the message API")
public interface MessageApi {

    @ApiOperation(value = "Adds a message", nickname = "addMessage", notes = "Add a message to the dataBase", tags={ "message", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "message created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing message already exists") })
    @RequestMapping(value = "/message",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addMessage(@ApiParam(value = "Message to add"  )  @Valid @RequestBody Message body);


    @ApiOperation(value = "Delete a message", nickname = "deleteMessage", notes = "Delete a message to the dataBase", response = String.class, tags={ "message", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid messageId supplied"),
        @ApiResponse(code = 404, message = "Message not found") })
    @RequestMapping(value = "/message/{messageId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> deleteMessage(@ApiParam(value = "The id that needs to be deleted",required=true) @PathVariable("messageId") String messageId);


    @ApiOperation(value = "get all messages", nickname = "getAllMessages", notes = "Get messages from the dataBase ", response = Message.class, responseContainer = "List", tags={ "message", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Message.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid conversationId supplied"),
        @ApiResponse(code = 404, message = "Message not found") })
    @RequestMapping(value = "/message",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Message>> getAllMessages(@ApiParam(value = "find all the message of a Conversation") @Valid @RequestParam(value = "conversationId", required = false) String conversationId);


    @ApiOperation(value = "get a message", nickname = "getMessageId", notes = "Get a message from the dataBase with his id ", response = Message.class, responseContainer = "List", tags={ "message", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Message.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid message Id supplied"),
        @ApiResponse(code = 404, message = "Message not found") })
    @RequestMapping(value = "/message/{messageId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Message>> getMessageId(@ApiParam(value = "Id of the message to search",required=true) @PathVariable("messageId") String messageId);


    @ApiOperation(value = "Update an message", nickname = "updateMessage", notes = "update a message.", response = Message.class, tags={ "message", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Message.class),
        @ApiResponse(code = 400, message = "Invalid message supplied"),
        @ApiResponse(code = 404, message = "Message not found") })
    @RequestMapping(value = "/message",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Message> updateMessage(@ApiParam(value = "Updated message object" ,required=true )  @Valid @RequestBody Message body);

}
