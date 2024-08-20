package com.restaurant.controller;

/*
Handles login logic.
 */

import com.restaurant.service.UserService;
import com.restaurant.gui.LoginFrame;

public class LoginController {
    private UserService userService;
    private LoginFrame loginFrame;

    public LoginController(UserService userService, LoginFrame loginFrame) {
        this.userService = userService;
        this.loginFrame = loginFrame;

        // TODO: Set up action listeners for login frame
    }

    // TODO: Implement methods to handle login logic
}