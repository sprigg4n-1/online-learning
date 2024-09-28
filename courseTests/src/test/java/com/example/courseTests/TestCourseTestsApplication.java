package com.example.courseTests;

import org.springframework.boot.SpringApplication;

public class TestCourseTestsApplication {

	public static void main(String[] args) {
		SpringApplication.from(CourseTestsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
