package io.swagger.api;

import io.swagger.model.CourseDocument;

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
public class CourseDocumentApiControllerIntegrationTest {

    @Autowired
    private CourseDocumentApi api;

    @Test
    public void addCourseDocumentTest() throws Exception {
        CourseDocument body = new CourseDocument();
        ResponseEntity<CourseDocument> responseEntity = api.addCourseDocument(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteCourseDocumentTest() throws Exception {
        String courseDocumentId = "courseDocumentId_example";
        ResponseEntity<String> responseEntity = api.deleteCourseDocument(courseDocumentId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllCourseDocumentTest() throws Exception {
        String userPostId = "userPostId_example";
        String courseId = "courseId_example";
        ResponseEntity<List<CourseDocument>> responseEntity = api.getAllCourseDocument(userPostId, courseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCourseDocumentIdTest() throws Exception {
        String courseDocumentId = "courseDocumentId_example";
        ResponseEntity<CourseDocument> responseEntity = api.getCourseDocumentId(courseDocumentId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateCourseDocumentTest() throws Exception {
        CourseDocument body = new CourseDocument();
        ResponseEntity<String> responseEntity = api.updateCourseDocument(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
