package com.restaurant.service;

/*
Manages table assignments and statuses.
 */

import com.restaurant.model.Table;

import java.util.List;

public class TableService {
    private List<Table> tables;

    public TableService() {
        // TODO: Initialize tables list (maybe load from file)
    }

    public void assignTable(int tableId) {
        // TODO: Assign a table by ID
    }

    public void updateTableStatus(int tableId, String status) {
        // TODO: Update the status of a table by ID
    }

    public List<Table> getAllTables() {
        // TODO: Return all tables
        return null;
    }

    // TODO: Implement methods to load and save tables to file
}