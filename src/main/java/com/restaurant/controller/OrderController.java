package com.restaurant.controller;

/*
Connects the GUI with the OrderService.
 */

import com.restaurant.service.OrderService;
import com.restaurant.gui.OrderProcessingPanel;

public class OrderController {
    private OrderService orderService;
    private OrderProcessingPanel orderProcessingPanel;

    public OrderController(OrderService orderService, OrderProcessingPanel orderProcessingPanel) {
        this.orderService = orderService;
        this.orderProcessingPanel = orderProcessingPanel;

        // TODO: Set up action listeners for order processing panel
    }

    // TODO: Implement methods to interact with OrderService
}