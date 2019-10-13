package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Comment;
import io.swagger.model.Conversation;
import io.swagger.repository.ConversationRepo;
@Service
public class ConversationApiImpl implements ConversationApiDelegate{
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	ConversationRepo conversationRepo;
	
	@Override
	public ResponseEntity<Conversation> addConversationImpl(Conversation conversation) {
		//Add a conversation to the dataBase Implemented method
		try {
			return new ResponseEntity<Conversation>(conversationRepo.save(conversation),HttpStatus.OK);
		}catch(Error e) {
		    log.error("Couldn't serialize response for content type application/json", e);
		    return new ResponseEntity<Conversation>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteConversationImpl(String conversationId) {
		// Delete a conversation of the dataBase Implemented method
		try {
			if(conversationRepo.exists(Long.parseLong(conversationId))){
				conversationRepo.delete(Long.parseLong(conversationId));
			 	return new ResponseEntity<String>(HttpStatus.OK);
			}
			else {
	            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Conversation>> getAllConversationsUserIdImpl(String userId) {
		// Get all the conversations from a user
		try {
			ArrayList<Conversation> listConversation = new ArrayList<Conversation>();
			for(int i = 0; i<conversationRepo.findAll().size(); i++) {
				if (conversationRepo.findAll().get(i).getFromId() == Long.parseLong(userId)) {
					listConversation.add(conversationRepo.findAll().get(i));
				}
				if (conversationRepo.findAll().get(i).getToId() == Long.parseLong(userId)) {
					listConversation.add(conversationRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<Conversation>>(listConversation ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Conversation>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Conversation>> getAllConversationsImpl() {
		// Get all the conversations
		try {
			return new ResponseEntity<List<Conversation>>(conversationRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Conversation>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Conversation> getConversationIdImpl(String conversationId) {
		//Get a conversation with its ID
		try {
			if(conversationRepo.exists(Long.parseLong(conversationId))){
				return new ResponseEntity<Conversation>(conversationRepo.findOne(Long.parseLong(conversationId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<Conversation>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Conversation>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateConversationImpl(Conversation conversation) {
		// Update a conversation
		try {
			if(conversationRepo.exists(conversation.getId())){
				Conversation newConversation = conversationRepo.getOne(conversation.getId());
				newConversation.setFromId(conversation.getFromId());
				newConversation.setToId(conversation.getToId());
				newConversation.setObject(conversation.getObject());
				newConversation.setDateTime(conversation.getDateTime());
				conversationRepo.save(newConversation);
				return new ResponseEntity<String>(HttpStatus.OK);
			}else {
	            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			}	
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
