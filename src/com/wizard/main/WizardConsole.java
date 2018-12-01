/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main;

import com.wizard.util.menu.Menu;
import com.wizard.util.menu.MenuEntry;

/**
 *
 * @author ilichh1
 */
public class WizardConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Menu menuDeInicio = new Menu(new MenuEntry[] {
            new MenuEntry("PRODUCTOS", 'A', "goToProductsMenu"),
            new MenuEntry("CLIENTES", 'B', "goToClientsMenu"),
            new MenuEntry("VENDEDORES", 'C', "goToSalesmenMenu"),
            new MenuEntry("VENTAS", 'D', "goToSellsMenu"),
            new MenuEntry("SALIR", 'E', "exit")
        }, "Menú de Inicio");
        
        menuDeInicio.printInConsole();
        
    }
    
    public static boolean doSpecificAction(String actionName) {
        // TODO: Completar codigo para realizar cada acción en especifico
        System.out.println("Doing: " + actionName);
        return true;
    }
    
}
