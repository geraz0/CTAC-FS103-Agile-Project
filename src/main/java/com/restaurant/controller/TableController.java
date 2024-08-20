package com.restaurant.controller;

/*
Connects the GUI with the TableService.
 */

import com.restaurant.service.TableService;
import com.restaurant.gui.TableManagementPanel;

public class TableController {
    private TableService tableService;
    private TableManagementPanel tableManagementPanel;

    public TableController(TableService tableService, TableManagementPanel tableManagementPanel) {
        this.tableService = tableService;
        this.tableManagementPanel = tableManagementPanel;

        // TODO: Set up action listeners for table management panel
    }

    // TODO: Implement methods to interact with TableService
}