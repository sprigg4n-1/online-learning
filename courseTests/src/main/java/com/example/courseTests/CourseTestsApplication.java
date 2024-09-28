package com.example.courseTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CourseTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseTestsApplication.class, args);
	}

}
