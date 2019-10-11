package io.swagger.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.model.Comment;
import io.swagger.repository.CommentRepo;
@Service 
public class CommentApiImpl implements CommentApiDelegate {
	

	@Autowired
	CommentRepo commentRepo;
	
	@Override
	public ResponseEntity<Comment> addCommentImpl(Comment comment) {
		//Add a comment to the dataBase Impl method
        return new ResponseEntity<Comment>(commentRepo.save(comment),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deleteCommentImpl(String commentId) {
		// TODO Auto-generated method stub
		return CommentApiDelegate.super.deleteCommentImpl(commentId);
	}

	@Override
	public ResponseEntity<List<Comment>> getAllCommentsUserIdImpl(String userId) {
		// TODO Auto-generated method stub
		return CommentApiDelegate.super.getAllCommentsUserIdImpl(userId);
	}

	@Override
	public ResponseEntity<List<Comment>> getAllCommentsCourseIdImpl(String courseId) {
		// TODO Auto-generated method stub
		return CommentApiDelegate.super.getAllCommentsCourseIdImpl(courseId);
	}

	@Override
	public ResponseEntity<List<Comment>> getAllCommentsImpl() {
		// TODO Auto-generated method stub
		return CommentApiDelegate.super.getAllCommentsImpl();
	}

	@Override
	public ResponseEntity<List<Comment>> getCommentIdImpl(String commentId) {
		// TODO Auto-generated method stub
		return CommentApiDelegate.super.getCommentIdImpl(commentId);
	}

	@Override
	public ResponseEntity<Comment> updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return CommentApiDelegate.super.updateComment(comment);
	}

}
