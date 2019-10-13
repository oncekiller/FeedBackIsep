package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.Comment;
import io.swagger.model.Conversation;

public interface ConversationApiDelegate {
	
	default ResponseEntity<Conversation> addConversationImpl(Conversation conversation) {
        return new ResponseEntity<Conversation>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteConversationImpl(String conversationId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Conversation>> getAllConversationsUserIdImpl(String userId){
        return new ResponseEntity<List<Conversation>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Conversation>> getAllConversationsImpl(){
        return new ResponseEntity<List<Conversation>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<Conversation> getConversationIdImpl(String conversationId){
        return new ResponseEntity<Conversation>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateConversationImpl(Conversation conversation){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
}

