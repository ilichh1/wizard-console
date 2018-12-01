/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main.controllers;

import com.wizard.product.Product;
import com.wizard.utils.ConsoleUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author ilichh1
 */
public class ProductsController {
    private static final String[] COLUMN_HEADERS = new String[] {
        "ID",
        "Nombre",
        "Categoria",
        "Existencia",
        "Precio"
    };
    
    // FIELDS
    private ArrayList<Product> products = new ArrayList<>();
    private final HashMap<String, Integer> columnWidths = new HashMap<>();
    
    
    public ProductsController() {
        this.initializateProductsController();
    }
    
    public void createAndSaveProduct() {
        Product productToSave = new Product();
        productToSave.promptInConsole();
        
        this.products.add(productToSave);
        ConsoleUtils.printSuccessMessage("Producto guardado correctamente.");
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
        
        this.columnWidths.put("id", 4);
        this.columnWidths.put("name", COLUMN_HEADERS[1].length());
        this.columnWidths.put("category", COLUMN_HEADERS[2].length());
        this.columnWidths.put("stock", COLUMN_HEADERS[3].length());
        this.columnWidths.put("price", COLUMN_HEADERS[4].length());
    }
    
    public void printTable() {
        this.determineColumnWidths();
        
        String tableContent = "";
        
        // Determine the maximum width available
        String tableVerticalLines = this.generateTableVerticalLines();
        
        // The very first vertical line
        tableContent += tableVerticalLines;
        
        // Create table headers
        String tableHeaders = "| ";
        tableHeaders += COLUMN_HEADERS[0]
                + this.getRemainingSpace(COLUMN_HEADERS[0].length(), this.columnWidths.get("id"))
                + " | ";
        tableHeaders += COLUMN_HEADERS[1]
                + this.getRemainingSpace(COLUMN_HEADERS[1].length(), this.columnWidths.get("name"))
                + " | ";
        tableHeaders += COLUMN_HEADERS[2]
                + this.getRemainingSpace(COLUMN_HEADERS[2].length(), this.columnWidths.get("category"))
                + " | ";
        tableHeaders += COLUMN_HEADERS[3]
                + this.getRemainingSpace(COLUMN_HEADERS[3].length(), this.columnWidths.get("stock"))
                + " | ";
        tableHeaders += COLUMN_HEADERS[4]
                + this.getRemainingSpace(COLUMN_HEADERS[3].length(), this.columnWidths.get("price"))
                + "  |"; // TODO: Quitar espacio hardcodeado. Ver por que falta un espacio en los headers
        // End of the table headers row
        tableHeaders += "\n" + tableVerticalLines;
        // Append the tableHeaders to the table actual content
        tableContent += tableHeaders;
        
        // FOR EACH TABLE ROW
        int counter = 0;
        for (Product product : this.products) {
            String productId = Integer.toString(counter);
            String productName = product.getName();
            String productCategory = product.getCategory();
            String productStock = Integer.toString(product.getStock());
            String productPrice = Double.toString(product.getPrice());
            
            String productRow = "| "; // <-- Start of the row
            
            // ID COLUMN
            productRow
                += productId
                + this.getRemainingSpace(productId.length(), this.columnWidths.get("id"))
                + " | ";
            // NAME COLUMN
            productRow
                += productName
                + this.getRemainingSpace(productName.length(), this.columnWidths.get("name"))
                + " | ";
            // CATEGORY COLUMN
            productRow
                += productCategory
                + this.getRemainingSpace(productCategory.length(), this.columnWidths.get("category"))
                + " | ";
            // STOCK COLUMN
            productRow
                += productStock
                + this.getRemainingSpace(productStock.length(), this.columnWidths.get("stock"))
                + " | ";
            // PRICE COLUMN
            productRow
                += productPrice
                + this.getRemainingSpace(productPrice.length(), this.columnWidths.get("price"))
                + " |\n"; // <-- END OF THE ROW
            
            tableContent += productRow + tableVerticalLines;
            counter++;
        }
        // END OF THE TABLE CONTENT
        
        // Print EVERYTHING to console
        System.out.println(tableContent);
    }
    
    private String getRemainingSpace(int currentLength, int suposedLenth) {
        int lengtDifference = suposedLenth - currentLength;
        if (lengtDifference <= 0)
            return "";
        // Calculate the space left to fill the column width
        String remainingSpace = "";
        for (int i = 0; i < lengtDifference; i++)
            remainingSpace += " ";
        
        return remainingSpace;
    }
    
    private String generateTableVerticalLines() {
        String tableVerticalLines = "";
        for (int i = 0; i < this.totalTableWidth(); i++) {
            tableVerticalLines += "-";
        }
        tableVerticalLines += "\n";
        return tableVerticalLines;
    }
    
    private int totalTableWidth() {
        int contentsMaxWidth = 0;
        
        contentsMaxWidth += this.columnWidths.get("id");
        contentsMaxWidth += this.columnWidths.get("name");
        contentsMaxWidth += this.columnWidths.get("category");
        contentsMaxWidth += this.columnWidths.get("stock");
        contentsMaxWidth += this.columnWidths.get("price");
        contentsMaxWidth += (COLUMN_HEADERS.length * 2) + (COLUMN_HEADERS.length + 1);
        
        return contentsMaxWidth;
    }
    
    private void determineColumnWidths() {
        for (Product product : this.products) {
            this.compareColumnWidth("name", product.getName().length());
            this.compareColumnWidth("category", product.getCategory().length());
            this.compareColumnWidth("stock", Integer.toString(product.getStock()).length());
            this.compareColumnWidth("price", Double.toString(product.getPrice()).length());
        }
    }
    
    private void compareColumnWidth(String colName, int width) {
        if (this.columnWidths.get(colName) < width)
            this.columnWidths.put(colName, width);
    }

}
