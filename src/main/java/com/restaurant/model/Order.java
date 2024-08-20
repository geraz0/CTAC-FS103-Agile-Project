package com.restaurant.model;

/*
Represents an order with attributes like order ID, list of items, total price, status.
 */

import java.util.List;

public class Order {
    private String orderId;
    private List<MenuItem> items;
    private double totalPrice;
    private String status;

    public Order(String orderId, List<MenuItem> items, double totalPrice, String status) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    // Getters and setters
    // TODO: Implement getters and setters for each field
}