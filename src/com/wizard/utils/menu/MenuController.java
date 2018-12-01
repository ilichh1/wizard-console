/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.utils.menu;

import com.wizard.main.WizardConsole;
import com.wizard.utils.ConsoleUtils;
import java.util.ArrayList;

/**
 *
 * @author ilichh1
 */
public class MenuController {
    private final ArrayList<Menu> menus = new ArrayList<>();
    
    private Menu startingMenu;
    private Menu productsMenu;
    private Menu clientsMenu;
    private Menu salesmenMenu;
    private Menu sellsMenu;
    
    public MenuController() {
        try {
            this.initializateMenus();
        } catch (Exception ex) {
            ConsoleUtils.printErrorMessage(ex.getLocalizedMessage());
            WizardConsole.doSpecificAction("exit");
        } finally {
            this.triggerLastMenu();
        }
    }
    
    private void triggerLastMenu() {
        // TODO: Probablemente de un error aquí por el índice
        if (this.menus.size() == 1) {
            this.menus.get(0).printAndPrompt();
        } else {
            this.menus.get(this.menus.size() - 1).printAndPrompt();
        }
    }
    
    private void initializateMenus() throws Exception {
        // Menú de inicio
        this.startingMenu = new Menu("Menú de inicio", new MenuEntry[] {
            new MenuEntry("PRODUCTOS", 'A', "goToProductsMenu"),
            new MenuEntry("CLIENTES", 'B', "goToClientsMenu"),
            new MenuEntry("VENDEDORES", 'C', "goToSalesmenMenu"),
            new MenuEntry("VENTAS", 'D', "goToSellsMenu"),
            new MenuEntry("SALIR", 'E', "exit")
        });
        this.menus.add(startingMenu);

        // Menú de productos
        this.productsMenu = new Menu("Menú de productos", new MenuEntry[] {
            new MenuEntry("AGREGAR PRODUCTO", 'A', "addProduct"),
            new MenuEntry("VER TODOS LOS PRODUCTOS", 'B', "viewAllProducts"),
            new MenuEntry("BUSCAR PRODUCTO", 'C', "searchProduct"),
            new MenuEntry("EDITAR PRODUCTO", 'D', "editProduct"),
            new MenuEntry("REGRESAR", 'E', "goBack")
        });

        // Menú de clientes
        this.clientsMenu = new Menu("Menú de clientes", new MenuEntry[] {
            new MenuEntry("AGREGAR CLIENTE", 'A', "addClient"),
            new MenuEntry("VER TODOS LOS CLIENTES", 'B', "viewAllClients"),
            new MenuEntry("BUSCAR CLIENTE", 'C', "searchClient"),
            new MenuEntry("EDITAR CLIENTE", 'D', "editClient"),
            new MenuEntry("REGRESAR", 'E', "goBack")
        });

        // Menú de vendedores
        this.salesmenMenu = new Menu("Menú de clientes", new MenuEntry[] {
            new MenuEntry("AGREGAR VENDEDOR", 'A', "addSalesman"),
            new MenuEntry("VER TODOS LOS VENDEDOR", 'B', "viewAllSalesmen"),
            new MenuEntry("BUSCAR VENDEDOR", 'C', "searchSalesman"),
            new MenuEntry("EDITAR VENDEDOR", 'D', "editSalesman"),
            new MenuEntry("REGRESAR", 'E', "goBack")
        });

        // Menú de ventas
        this.sellsMenu = new Menu("Menú de ventas", new MenuEntry[] {
            new MenuEntry("AGREGAR VENTA", 'A', "addSell"),
            new MenuEntry("VER TODAS LAS VENTAS", 'B', "viewAllSells"),
            new MenuEntry("BUSCAR VENTA", 'C', "searchSell"),
            new MenuEntry("EDITAR VENTA", 'D', "editSell"),
            new MenuEntry("REGRESAR", 'E', "goBack")
        });
    }
    
    public void moveToMenu(String menuName) {
        switch (menuName) {
            case "products":
                this.menus.add(this.productsMenu);
            break;
            case "clients":
                this.menus.add(this.clientsMenu);
            break;
            case "salesmen":
                this.menus.add(this.salesmenMenu);
            break;
            case "sells":
                this.menus.add(this.sellsMenu);
            break;
            default:
                ConsoleUtils.printErrorMessage("El menú " + menuName + " no exite.");
        }
        this.triggerLastMenu();
    }
    
    public void previousMenu() {
        this.menus.remove(this.menus.size() - 1);
        this.triggerLastMenu();
    }
}
