package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.Message;

public interface MessageApiDelegate {
	default ResponseEntity<Message> addMessageImpl(Message message) {
        return new ResponseEntity<Message>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteMessageImpl(String messageId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Message>> getAllMessageConversationIdImpl(String conversationId){
        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Message>> getAllMessageImpl(){
        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<Message> getMessageIdImpl(String messageId){
        return new ResponseEntity<Message>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateMessageImpl(Message message){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}

}
