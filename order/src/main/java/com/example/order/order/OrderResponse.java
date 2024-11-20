package com.example.order.order;

import java.time.LocalDate;

public record OrderResponse(String id, double price, String courseId, String userId, LocalDate orderDate) {
    
}
