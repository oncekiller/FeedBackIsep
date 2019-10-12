package io.swagger.api;

import io.swagger.model.Comment;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentApiControllerIntegrationTest {

    @Autowired
    private CommentApi api;

    @Test
    public void addCommentTest() throws Exception {
        Comment body = new Comment();
        ResponseEntity<Comment> responseEntity = api.addComment(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteCommentTest() throws Exception {
        String commentId = "commentId_example";
        ResponseEntity<String> responseEntity = api.deleteComment(commentId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllCommentsTest() throws Exception {
        String userId = "userId_example";
        String courseId = "courseId_example";
        ResponseEntity<List<Comment>> responseEntity = api.getAllComments(userId, courseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCommentIdTest() throws Exception {
        String commentId = "commentId_example";
        ResponseEntity<Comment> responseEntity = api.getCommentId(commentId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateCommentTest() throws Exception {
        Comment body = new Comment();
        ResponseEntity<String> responseEntity = api.updateComment(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
