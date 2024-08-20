package com.restaurant.controller;

/*
Connects the GUI with the InventoryService.
 */

import com.restaurant.service.InventoryService;
import com.restaurant.gui.InventoryManagementPanel;

public class InventoryController {
    private InventoryService inventoryService;
    private InventoryManagementPanel inventoryManagementPanel;

    public InventoryController(InventoryService inventoryService, InventoryManagementPanel inventoryManagementPanel) {
        this.inventoryService = inventoryService;
        this.inventoryManagementPanel = inventoryManagementPanel;

        // TODO: Set up action listeners for inventory management panel
    }

    // TODO: Implement methods to interact with InventoryService
}