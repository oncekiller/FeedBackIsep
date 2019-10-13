package io.swagger.api;

import io.swagger.model.UserCourse;

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
public class UserCourseApiControllerIntegrationTest {

    @Autowired
    private UserCourseApi api;

    @Test
    public void addUserCourseTest() throws Exception {
        UserCourse body = new UserCourse();
        ResponseEntity<UserCourse> responseEntity = api.addUserCourse(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteUserCourseTest() throws Exception {
        String userCourseId = "userCourseId_example";
        ResponseEntity<String> responseEntity = api.deleteUserCourse(userCourseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllUserCourseTest() throws Exception {
        String userId = "userId_example";
        String courseId = "courseId_example";
        ResponseEntity<List<UserCourse>> responseEntity = api.getAllUserCourse(userId, courseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getUserCourseIdTest() throws Exception {
        String userCourseId = "userCourseId_example";
        ResponseEntity<UserCourse> responseEntity = api.getUserCourseId(userCourseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateUserCourseTest() throws Exception {
        UserCourse body = new UserCourse();
        ResponseEntity<String> responseEntity = api.updateUserCourse(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
