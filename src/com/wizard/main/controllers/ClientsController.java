/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main.controllers;

import com.wizard.client.Client;
import com.wizard.utils.ConsoleUtils;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ilichh1
 */
public class ClientsController {
    
    private final ArrayList<Client> clients = new ArrayList<>();
    
    private static final String[] COLUMN_HEADERS = new String[] {
        "ID",
        "Nombre(s)",
        "Apellido(s)",
        "Télefono",
        "Email",
        "Dirección"
    };
    
    public ClientsController() {
        this.initializateClientsController();
    }
    
    private void initializateClientsController() {
        this.clients.addAll(Arrays.asList(new Client[] {
            new Client("Juan", "Pérez", "3317995533", "juanperez0@mail.com", "Calle 123, Guadalajara, Jalisco"),
            new Client("Juan", "Rodriguez", "3317995599", "juanperez1@mail.com", "Calle 123, Zapopan, Jalisco"),
            new Client("Juan", "Salas", "3317995555", "juanperez2@mail.com", "Calle 123, Tlajomulco, Jalisco"),
            new Client("Juan", "Hernández", "3317995511", "juanperez3@mail.com", "Calle 123, Tlaquepaque, Jalisco"),
            new Client("Juan", "Harrison", "3317995522", "juanperez4@mail.com", "Calle 23, Tonala, Jalisco")
        }));
    }
    
    public void createAndSaveClient() {
        Client clientToSave = new Client();
        clientToSave.promptInConsole();
        
        this.clients.add(clientToSave);
        ConsoleUtils.printSuccessMessage("Cliente guardado correctamente.");
    }
    
    public void printTable() {
        Client[] clientsArray = this.clients.toArray(new Client[this.clients.size()]);
        ConsoleUtils.printAsTable(clientsArray, COLUMN_HEADERS);
    }
}
