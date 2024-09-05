package com.example.ead_2_course_work.service;

import com.example.ead_2_course_work.data.Order;
import com.example.ead_2_course_work.data.OrderRepository;
import com.example.ead_2_course_work.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        // Calculate total amount
        double total = order.getOrderItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity() - item.getDiscount())
                .sum();
        order.setTotalAmount(total);
        order.setStatus("Pending");
        return orderRepository.save(order);
    }

    public Order getOrderById(int orderId) {
        if (orderRepository.findById(orderId).isPresent()) {
            return orderRepository.findById(orderId).get();
        } else {
            throw new ResourceNotFoundException("Order not found");
        }
    }

    public List<Order> getOrderHistory(int customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public Order updateOrderStatus(int orderId, String status) {
        Order order = getOrderById(orderId);
        order.setStatus(status);
        return orderRepository.save(order);
    }
}
