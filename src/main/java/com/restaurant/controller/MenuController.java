package com.restaurant.controller;

/*
Connects the GUI with the MenuService.
 */

import com.restaurant.service.MenuService;
import com.restaurant.gui.MenuManagementPanel;

public class MenuController {
    private MenuService menuService;
    private MenuManagementPanel menuManagementPanel;

    public MenuController(MenuService menuService, MenuManagementPanel menuManagementPanel) {
        this.menuService = menuService;
        this.menuManagementPanel = menuManagementPanel;

        // TODO: Set up action listeners for menu management panel
    }

    // TODO: Implement methods to interact with MenuService
}