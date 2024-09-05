package com.example.ead_2_course_work.controller;

import com.example.ead_2_course_work.data.Order;
import com.example.ead_2_course_work.service.OrderService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {//ResponseEntity - used to represent an HTTP response in a RESTful web service
        Order placedOrder = orderService.placeOrder(order);
        return new ResponseEntity<>(placedOrder, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{order_id}")
    public ResponseEntity<Order> getOrderById(@PathVariable int order_id) {
        Order order = orderService.getOrderById(order_id);
        return new ResponseEntity<>(order, HttpStatus.OK);// HttpStatus.OK indicates a successful request with HTTP status code 200
    }

    @GetMapping(path = "/history", params = "customer_id")
    public ResponseEntity<List<Order>> getOrderHistory(@RequestParam int customer_id) {
        List<Order> orders = orderService.getOrderHistory(customer_id);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PutMapping(path = "/{order_id}/status")
    public ResponseEntity<Order> updateOrderStatus(@PathVariable int order_id, @RequestBody String status) {
        Order updatedOrder = orderService.updateOrderStatus(order_id, status);
        return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
    }
}
