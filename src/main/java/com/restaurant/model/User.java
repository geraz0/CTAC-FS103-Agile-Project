package com.restaurant.model;

/*
Represents users with attributes like username, passwordHash, role.
 */

public class User {
    private String username;
    private String passwordHash;
    private String role;

    public User(String username, String passwordHash, String role) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    // Getters and setters
    // TODO: Implement getters and setters for each field
}