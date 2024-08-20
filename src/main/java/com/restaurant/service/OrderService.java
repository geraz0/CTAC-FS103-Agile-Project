package com.restaurant.service;

/*
Handles order processing, updating order statuses, and calculating total prices.
 */

import com.restaurant.model.Order;

import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService() {
        // TODO: Initialize orders list (maybe load from file)
    }

    public void addOrder(Order order) {
        // TODO: Add a new order
    }

    public void updateOrderStatus(String orderId, String status) {
        // TODO: Update the status of an order by ID
    }

    public List<Order> getAllOrders() {
        // TODO: Return all orders
        return null;
    }

    // TODO: Implement methods to load and save orders to file
}