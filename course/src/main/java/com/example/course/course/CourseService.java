package com.example.course.course;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CourseService {
    private final CourseRepository courseRepository;

    public void createCourse(CourseRequest courseRequest) {
        Course course = Course.builder()
        .title(courseRequest.title())
        .description(courseRequest.description())
        .duration(courseRequest.duration())
        .build();

        courseRepository.save(course);
        log.info("Course {} is saved", course.getId());
    }

    public Course getCourseById(String id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        
        if (courseOptional.isPresent()) {
            return courseOptional.get();
        } else {
            log.warn("Course with ID {} not found", id);
            throw new RuntimeException("Course not found with ID: " + id);
        }
    }

    public List<CourseResponse> getAllCourses() {
        List<Course> courses = courseRepository.findAll();

        return courses.stream().map(this::mapToCourseResponse).toList();
    }

    private CourseResponse mapToCourseResponse(Course course) {
        return new CourseResponse(course.getId(), course.getTitle(), course.getDescription(), course.getDuration());
    }
}
