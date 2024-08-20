package com.restaurant.service;

/*
Tracks ingredient usage, updates quantities, and alerts when running low.
 */

import com.restaurant.model.InventoryItem;

import java.util.List;

public class InventoryService {
    private List<InventoryItem> inventoryItems;

    public InventoryService() {
        // TODO: Initialize inventory list (maybe load from file)
    }

    public void updateInventoryItem(String ingredientName, int quantity) {
        // TODO: Update the quantity of an inventory item
    }

    public List<InventoryItem> getAllInventoryItems() {
        // TODO: Return all inventory items
        return null;
    }

    public boolean isRunningLow(String ingredientName) {
        // TODO: Check if a particular ingredient is running low
        return false;
    }

    // TODO: Implement methods to load and save inventory items to file
}