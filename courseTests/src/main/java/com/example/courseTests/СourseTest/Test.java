package com.example.courseTests.СourseTest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "test")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Test {
    @Id
    private String id;
    private String title;
    private String description;
    private int timeLimit;    
    private String CourseId;
}
