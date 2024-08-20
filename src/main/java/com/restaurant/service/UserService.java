package com.restaurant.service;

/*
Handles user login, authentication, and role management.
 */

import com.restaurant.model.User;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        // TODO: Initialize user list (maybe load from file)
    }

    public boolean login(String username, String password) {
        // TODO: Implement login logic (hash password, compare with stored hash)
        return false;
    }

    public void addUser(User user) {
        // TODO: Add a new user
    }

    public void removeUser(String username) {
        // TODO: Remove a user by username
    }

    // TODO: Implement methods to load and save users to file
}
