package com.restaurant.service;

/*
Generates and exports sales reports.
 */

import com.restaurant.model.Order;

import java.util.List;

public class SalesReportService {
    private List<Order> orders;

    public SalesReportService(List<Order> orders) {
        this.orders = orders;
    }

    public String generateDailySalesReport() {
        // TODO: Generate and return a daily sales report summary
        return null;
    }

    public void exportReportToFile(String report, String filePath) {
        // TODO: Export the report to a text file
    }
}