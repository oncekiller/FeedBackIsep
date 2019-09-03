package io.swagger.api;

import io.swagger.model.Message;

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
public class MessageApiControllerIntegrationTest {

    @Autowired
    private MessageApi api;

    @Test
    public void addMessageTest() throws Exception {
        Message body = new Message();
        ResponseEntity<Void> responseEntity = api.addMessage(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteMessageTest() throws Exception {
        String messageId = "messageId_example";
        ResponseEntity<String> responseEntity = api.deleteMessage(messageId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllMessagesTest() throws Exception {
        String conversationId = "conversationId_example";
        ResponseEntity<List<Message>> responseEntity = api.getAllMessages(conversationId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getMessageIdTest() throws Exception {
        String messageId = "messageId_example";
        ResponseEntity<List<Message>> responseEntity = api.getMessageId(messageId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateMessageTest() throws Exception {
        Message body = new Message();
        ResponseEntity<Message> responseEntity = api.updateMessage(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
