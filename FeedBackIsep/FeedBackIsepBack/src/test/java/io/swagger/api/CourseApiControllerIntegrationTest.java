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
        ResponseEntity<Course> responseEntity = api.getCourseId(courseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }
    
    @Test
    public void addCourseTest() throws Exception {
        Course body = new Course();
        ResponseEntity<Course> responseEntity = api.addCourse(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllCoursesTest() throws Exception {
        String userId = "userId_example";
        String teacherId = "teacherId_example";
        String materialId = "materialId_example";
        ResponseEntity<List<Course>> responseEntity = api.getAllCourses(userId, teacherId, materialId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateCourseTest() throws Exception {
        Course body = new Course();
        ResponseEntity<String> responseEntity = api.updateCourse(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
