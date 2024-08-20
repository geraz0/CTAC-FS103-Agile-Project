package com.restaurant.service;

/*
Manages the menu, including adding, removing, and updating items.
 */

import com.restaurant.model.MenuItem;

import java.util.List;

public class MenuService {
    private List<MenuItem> menuItems;

    public MenuService() {
        // TODO: Initialize menu items list (maybe load from file)
    }

    public void addMenuItem(MenuItem item) {
        // TODO: Add a new menu item
    }

    public void removeMenuItem(String itemName) {
        // TODO: Remove a menu item by name
    }

    public void editMenuItem(MenuItem item) {
        // TODO: Edit an existing menu item
    }

    public List<MenuItem> getAllMenuItems() {
        // TODO: Return all menu items
        return null;
    }

    // TODO: Implement methods to load and save menu items to file
}