/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main.controllers;

import com.wizard.interfaces.TablePrintable;
import com.wizard.product.Product;
import com.wizard.utils.ConsoleUtils;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ilichh1
 */
public class ProductsController {
    // FIELDS
    private final ArrayList<Product> products = new ArrayList<>();
    private static final String[] PRODUCTS_HEADERS = new String[] {
        " ID ",
        "Nombre",
        "Categoria",
        "Existencia",
        "Precio" };
    
    public ProductsController() {
        this.initializateProductsController();
    }
    
    public void createAndSaveProduct() {
        Product productToSave = new Product();
        productToSave.promptInConsole();
        
        this.products.add(productToSave);
        ConsoleUtils.printSuccessMessage("Producto guardado correctamente.");
    }
    
    public Product getProductById(int id) {
        try {
            return this.products.get(id);
        } catch (Exception ex) {
            return null;
        }
    }
    
    private void initializateProductsController() {
        this.products.addAll(
                Arrays.asList(new Product[] {
                    new Product("Nerf SuperSoaker 501", Product.WATER_GUNS, 15, 499.99),
                    new Product("Barbie Super Estrella", Product.DOLLS, 25, 299.99),
                    new Product("Triciclo 4x4 Apache", Product.BIKES, 5, 1499.99),
                    new Product("El Oso de Tasha", Product.BEARS, 30, 199.99),
                    new Product("Ferrari 911", Product.RC_CARS, 10, 849.99)
                }) );
    }
    
    public void printTable() {
        TablePrintable[] rows = products.toArray(new TablePrintable[products.size()]);
        ConsoleUtils.printAsTable(rows, PRODUCTS_HEADERS);
    }
    
}
