package com.example.notification;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.notification.event.TestAddedEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationService {
    
    @KafkaListener(topics = "course-created")
    public void listen(TestAddedEvent testAddedEvent) {
        log.info("Got Message from test-created topic {}", testAddedEvent);
    }
}
