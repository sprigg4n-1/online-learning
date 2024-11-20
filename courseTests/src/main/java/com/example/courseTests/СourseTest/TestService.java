package com.example.courseTests.СourseTest;

import java.util.List;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.courseTests.event.TestAddedEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {
    private final TestRepository testRepository;
    private final CourseClient courseClient;

    private final KafkaTemplate<String, TestAddedEvent> kafkaTemplate;

    public void createTest(TestRequest testRequest) {
        CourseDTO course = courseClient.getCourseById(testRequest.courseId());

        if (course == null) {
            throw new RuntimeException("Course with ID " + testRequest.courseId() + " does not exist");
        }


        Test test = Test.builder()
            .title(testRequest.title())
            .description(testRequest.description())
            .timeLimit(testRequest.timeLimit())
            .courseId(testRequest.courseId())
            .build();



        testRepository.save(test);
        log.info("Test {} is saved", test.getId());

        var testAddedEvent = new TestAddedEvent(test.getId());
        kafkaTemplate.send("test-added", testAddedEvent);
    }

    public List<TestResponse> getAllTests() {
        List<Test> tests = testRepository.findAll();

        return tests.stream().map(this::mapToTestResponse).toList();
    }

    private TestResponse mapToTestResponse(Test test) {
        return new TestResponse(test.getId(), test.getTitle(), test.getDescription(), test.getTimeLimit(), test.getCourseId());
    }
}
