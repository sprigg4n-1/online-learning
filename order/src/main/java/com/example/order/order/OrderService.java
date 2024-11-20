package com.example.order.order;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepository orderRepository;

    public void createOrder(OrderRequest orderRequest) {
        Order order = Order.builder()
            .price(orderRequest.price())
            .courseId(orderRequest.courseId())
            .userId(orderRequest.userId())
            .build();

        orderRepository.save(order);
        log.info("Order {} is saved", order.getId());
    }

    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(this::mapToOrderResponse).toList();
    }

    private OrderResponse mapToOrderResponse(Order order) {
        return new OrderResponse(order.getId(), order.getPrice(), order.getCourseId(), order.getUserId(), order.getOrderDate());
    }
}
