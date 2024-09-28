package com.example.courseTests.СourseTest;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j

public class TestService {
    private final TestRepository testRepository;

    public void createTest(TestRequest testRequest) {
        Test test = Test.builder()
        .title(testRequest.title())
        .description(testRequest.description())
        .timeLimit(testRequest.timeLimit())
        .courseId(testRequest.courseId())
        .build();

        testRepository.save(test);
        log.info("Test {} is saved", test.getId());
    }

    public List<TestResponse> getAllTests() {
        List<Test> tests = testRepository.findAll();

        return tests.stream().map(this::mapToTestResponse).toList();
    }

    private TestResponse mapToTestResponse(Test test) {
        return new TestResponse(test.getId(), test.getTitle(), test.getDescription(), test.getTimeLimit(), test.getCourseId());
    }
}
