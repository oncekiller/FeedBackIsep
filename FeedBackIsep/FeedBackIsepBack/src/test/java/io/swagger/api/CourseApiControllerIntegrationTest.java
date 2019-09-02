package io.swagger.api;

import io.swagger.model.Course;

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
public class CourseApiControllerIntegrationTest {

    @Autowired
    private CourseApi api;

    @Test
    public void deleteCourseTest() throws Exception {
        String courseId = "courseId_example";
        ResponseEntity<String> responseEntity = api.deleteCourse(courseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCourseIdTest() throws Exception {
        String courseId = "courseId_example";
        ResponseEntity<List<Course>> responseEntity = api.getCourseId(courseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
