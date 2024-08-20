package com.restaurant.model;

/*
Represents a menu item with properties like name, description, price, etc.
 */

import java.util.List;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private List<String> ingredients;

    public MenuItem(String name, String description, double price, List<String> ingredients) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ingredients = ingredients;
    }

    // Getters and setters
    // TODO: Implement getters and setters for each field
}