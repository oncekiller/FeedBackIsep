package io.swagger.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.model.Comment;

public interface CommentApiDelegate {
	
	default ResponseEntity<Comment> addCommentImpl(Comment comment) {
        return new ResponseEntity<Comment>(HttpStatus.NOT_IMPLEMENTED);	
	}
	
	default ResponseEntity<String> deleteCommentImpl(String commentId){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Comment>> getAllCommentsUserIdImpl(String userId){
        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Comment>> getAllCommentsCourseIdImpl(String courseId){
        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Comment>> getAllCommentsCourseIdUserIdImpl(String courseId,String userId){
        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<List<Comment>> getAllCommentsImpl(){
        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<Comment> getCommentIdImpl(String commentId){
        return new ResponseEntity<Comment>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	default ResponseEntity<String> updateComment(Comment comment){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
	}
	
}
