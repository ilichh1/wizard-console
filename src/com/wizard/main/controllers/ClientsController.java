/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main.controllers;

import com.wizard.client.Client;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ilichh1
 */
public class ClientsController {
    
    private static final String[] COLUMN_HEADERS = new String[] {
        "ID",
        "Nombre(s)",
        "Apellido(s)",
        "Télefono",
        "Email",
        "Dirección"
    };
    
    private final ArrayList<Client> clients = new ArrayList<>();
    private final HashMap<String, Integer> columnWidths = new HashMap<>();
    
    public ClientsController() {
        
    }
    
    private void initializateClientsController() {
        
    }
    
    private void compareColumnWidth(String colName, int width) {
        if (this.columnWidths.get(colName) < width)
            this.columnWidths.put(colName, width);
    }
    
}
