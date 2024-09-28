package com.example.courseTests.СourseTest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="courseservice", url="${course.url}")
public interface CourseClient {
    @RequestMapping(method=RequestMethod.GET, value="/api/course/{id}")
    CourseDTO getCourseById(@PathVariable("id") String id);
}
