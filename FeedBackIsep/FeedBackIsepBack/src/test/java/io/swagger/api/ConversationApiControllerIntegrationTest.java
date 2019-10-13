package io.swagger.api;

import io.swagger.model.Conversation;

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
public class ConversationApiControllerIntegrationTest {

    @Autowired
    private ConversationApi api;

    @Test
    public void addConversationTest() throws Exception {
        Conversation body = new Conversation();
        ResponseEntity<Conversation> responseEntity = api.addConversation(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteConversationTest() throws Exception {
        String conversationId = "conversationId_example";
        ResponseEntity<String> responseEntity = api.deleteConversation(conversationId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllConversationsTest() throws Exception {
        String userId = "userId_example";
        ResponseEntity<List<Conversation>> responseEntity = api.getAllConversations(userId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getConversationIdTest() throws Exception {
        String conversationId = "conversationId_example";
        ResponseEntity<Conversation> responseEntity = api.getConversationId(conversationId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateConversationTest() throws Exception {
        Conversation body = new Conversation();
        ResponseEntity<String> responseEntity = api.updateConversation(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
