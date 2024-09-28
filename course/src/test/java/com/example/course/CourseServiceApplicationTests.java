package com.example.course;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;

import com.example.course.course.CourseRequest;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT) 
public class CourseServiceApplicationTests {
    
    @ServiceConnection
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:7.0.7");
    @LocalServerPort
    private Integer port;

    @BeforeEach
    void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    static {
        mongoDBContainer.start();
    }

    @Test
    void shouldCreateCourse() throws Exception {
        CourseRequest courseRequest = getCourseRequest();

        RestAssured.given()
            .contentType("application/json")
            .body(courseRequest)
            .when()
            .post("/api/course")
            .then()
            .log().all()
            .statusCode(201);
    }

    private CourseRequest getCourseRequest() {
        return new CourseRequest("first course", "description hier", 222);
    }
}
