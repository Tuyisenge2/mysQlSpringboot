package com.mypackage.demoMysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypackage.demoMysql.model.Order;
import com.mypackage.demoMysql.repo.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> updateOrder(Long id, Order orderDetails) {
        return orderRepository.findById(id).map(order -> {
            order.setProductId(orderDetails.getProductId());
            order.setQuantity(orderDetails.getQuantity());
            return orderRepository.save(order);
        });
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}