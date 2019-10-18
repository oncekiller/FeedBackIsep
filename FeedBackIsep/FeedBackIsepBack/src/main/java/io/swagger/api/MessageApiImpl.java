package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Course;
import io.swagger.model.Message;
import io.swagger.repository.MessageRepo;

@Service
public class MessageApiImpl implements MessageApiDelegate{

	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	MessageRepo messageRepo;
	
	
	@Override
	public ResponseEntity<Message> addMessageImpl(Message message) {
		//Add a message to the dataBase Implemented method
		try {
	        return new ResponseEntity<Message>(messageRepo.save(message),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Message>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteMessageImpl(String messageId) {
		// Delete a message of the dataBase Implemented method
		try {
			if(messageRepo.exists(Long.parseLong(messageId))){
				messageRepo.delete(Long.parseLong(messageId));
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
	public ResponseEntity<List<Message>> getAllMessageConversationIdImpl(String conversationId) {
		// Get all the messages from a conversation
		try {
			ArrayList<Message> listMessage = new ArrayList<Message>();
			for(int i = 0; i<messageRepo.findAll().size(); i++) {
				if (messageRepo.findAll().get(i).getConversationId() == Long.parseLong(conversationId)) {
					listMessage.add(messageRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<Message>>(listMessage ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Message>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Message>> getAllMessageImpl() {
		// Get all the messages
		try {
			return new ResponseEntity<List<Message>>(messageRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Message>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Message> getMessageIdImpl(String messageId) {
		//Get a message with its ID
		try {
			if(messageRepo.exists(Long.parseLong(messageId))){
				return new ResponseEntity<Message>(messageRepo.findOne(Long.parseLong(messageId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<Message>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Message>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateMessageImpl(Message message) {
		// Update a message
		try {
			if(messageRepo.exists(message.getId())){
				Message newMessage = messageRepo.getOne(message.getId());
				newMessage.setConversationId(message.getConversationId());
				newMessage.setIsFromSender(message.isIsFromSender());
				newMessage.setContent(message.getContent());
				newMessage.setIsRead(message.isIsRead());
				newMessage.setDateTime(message.getDateTime());
				messageRepo.save(newMessage);
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
