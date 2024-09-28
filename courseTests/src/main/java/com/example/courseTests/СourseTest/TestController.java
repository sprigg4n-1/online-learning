package com.example.courseTests.СourseTest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTest(@RequestBody TestRequest testRequest) {
        testService.createTest(testRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TestResponse> getAllTests() {
        return testService.getAllTests();
    }
}