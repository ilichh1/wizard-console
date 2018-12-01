/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.product;

/**
 *
 * @author ilichh1
 */
public class Product {
    // CATEGORIES
    public static final int BIKES = 0;
    public static final int WATER_GUNS = 1;
    public static final int DOLLS = 2;
    public static final int BEARS = 3;
    public static final int TABLE_GAMES = 4;
    public static final int RC_CARS = 5;
    public static final String[] CATEGORIES = new String[] {
        "Bicicletas",
        "Pistolas de agua",
        "Muñecas / Muñecos",
        "Osos de felpa",
        "Juegos de mesa",
        "Carros a control remoto"
    };
    
    // Fields
    private String name;
    private int category;
    private int stock;
    private double price;
    
    public Product() {
        this.name = null;
        this.category = -1;
        this.stock = -1;
        this.price = Double.NaN;
    }
    
    public Product(String name, int category, int stock, double price) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }
    
    // Getters / Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return CATEGORIES[this.category];
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
