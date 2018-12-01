/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main;

import com.wizard.utils.menu.MenuController;

/**
 *
 * @author ilichh1
 */
public class WizardConsole {
    
    private static final MenuController menuController = new MenuController();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static boolean doSpecificAction(String actionName) {
        // TODO: Completar codigo para realizar cada acción en especifico
        switch(actionName) {
            case "exit":
                System.out.println("¡Hasta luego! - Webtix Software");
                System.exit(0);
            break;
            case "goToProductsMenu";
                menuController.moveToMenu("products");
            break;
            case "goToClientsMenu";
                menuController.moveToMenu("clients");
            break;
            case "goToSalesmenMenu";
                menuController.moveToMenu("salesmen");
            break;
            case "goToSellsMenu";
                menuController.moveToMenu("sells");
            break;
            case "goBack":
                menuController.previousMenu();
            break;
            default:
                System.out.println("Doing: " + actionName);
        }
        return true;
    }
    
}
