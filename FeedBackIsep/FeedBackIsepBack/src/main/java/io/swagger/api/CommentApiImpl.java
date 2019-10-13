package io.swagger.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Comment;
import io.swagger.repository.CommentRepo;
@Service 
public class CommentApiImpl implements CommentApiDelegate {
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);
	@Autowired
	CommentRepo commentRepo;
	
	@Override
	public ResponseEntity<Comment> addCommentImpl(Comment comment) {
		//Add a comment to the dataBase Implemented method
		try {
	        return new ResponseEntity<Comment>(commentRepo.save(comment),HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Comment>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> deleteCommentImpl(String commentId) {
		// Delete a comment of the dataBase Implemented method
		try {
			if(commentRepo.exists(Long.parseLong(commentId))){
				commentRepo.delete(Long.parseLong(commentId));
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
	public ResponseEntity<List<Comment>> getAllCommentsUserIdImpl(String userId) {
		// Get all the comments from a user
		try {
			ArrayList<Comment> listComment = new ArrayList<Comment>();
			for(int i = 0; i<commentRepo.findAll().size(); i++) {
				if (commentRepo.findAll().get(i).getUserId() == Long.parseLong(userId)) {
					listComment.add(commentRepo.findAll().get(i));
				}
			}
		 	return new ResponseEntity<List<Comment>>(listComment ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Comment>> getAllCommentsCourseIdImpl(String courseId) {
		// Get all the comments from a course
		try {
			ArrayList<Comment> listComment = new ArrayList<Comment>();
			for(int i = 0; i<commentRepo.findAll().size(); i++) {
				if (commentRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId)) {
					listComment.add(commentRepo.findAll().get(i));
				}
			}
			return new ResponseEntity<List<Comment>>(listComment ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Comment>> getAllCommentsCourseIdUserIdImpl(String courseId, String userId) {
		// Get all the comments from a course of a user
		try {
			ArrayList<Comment> listComment = new ArrayList<Comment>();
			for(int i = 0; i<commentRepo.findAll().size(); i++) {
				if (commentRepo.findAll().get(i).getCourseId() == Long.parseLong(courseId) && commentRepo.findAll().get(i).getUserId() == Long.parseLong(userId)) {
					listComment.add(commentRepo.findAll().get(i));
				}
			}
			return new ResponseEntity<List<Comment>>(listComment ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Comment>> getAllCommentsImpl() {
		// Get all the comments
		try {
			return new ResponseEntity<List<Comment>>(commentRepo.findAll() ,HttpStatus.OK);
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Comment> getCommentIdImpl(String commentId) {
		//Get a comment with its ID
		try {
			if(commentRepo.exists(Long.parseLong(commentId))){
				return new ResponseEntity<Comment>(commentRepo.findOne(Long.parseLong(commentId)),HttpStatus.OK);
			}else {
	            return new ResponseEntity<Comment>(HttpStatus.BAD_REQUEST);
			}
		}catch(Error e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Comment>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<String> updateCommentImpl(Comment comment) {
		// Update a comment
		try {
			if(commentRepo.exists(comment.getId())){
				Comment newComment = commentRepo.getOne(comment.getId());
				newComment.setUserId(comment.getUserId());
				newComment.setCourseId(comment.getCourseId());
				newComment.setContent(comment.getContent());
				newComment.setDateTime(comment.getDateTime());
				newComment.setNumberLike(comment.getNumberLike());
				newComment.setNumberDislike(comment.getNumberDislike());
				newComment.setParentId(comment.getParentId());
				commentRepo.save(newComment);
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
