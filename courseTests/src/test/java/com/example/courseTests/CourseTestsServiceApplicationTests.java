package com.example.courseTests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.testcontainers.containers.MongoDBContainer;

import com.example.courseTests.СourseTest.TestRequest;
import com.github.tomakehurst.wiremock.client.WireMock;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT) 
@AutoConfigureWireMock(port = 0)
public class CourseTestsServiceApplicationTests {
    
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
        TestRequest testRequest = getTestRequest();

        mockCourseClientResponse(testRequest.courseId());

        RestAssured.given()
            .contentType("application/json")
            .body(testRequest)
            .when()
            .post("/api/course")
            .then()
            .log().all()
            .statusCode(201);
    }

    private void mockCourseClientResponse(String courseId) {
        String courseResponse = """
            "id": "%s",
            "title": "Sample Course",
            "description": "Sample description",
            "duration": 120
        """.formatted(courseId);

        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/api/course/" + courseId))
        .willReturn(WireMock.aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody(courseResponse)
                .withStatus(200)));
    }

    private TestRequest getTestRequest() {
        return new TestRequest("first course", "description hier", 222, "66d71bc23a9f46663b9d8f7f");
    }
}
