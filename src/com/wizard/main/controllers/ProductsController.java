/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main.controllers;

import com.wizard.product.Product;

/**
 *
 * @author ilichh1
 */
public class ProductsController {
    
    // CATEGORIES
    public static final String BIKES = "Bicicletas";
    public static final String WATER_GUNS = "Pistolas de agua";
    public static final String DOLLS = "Muñecas/Muñecos";
    public static final String BEARS = "Osos de felpa";
    public static final String TABLE_GAMES = "Juegos de mesa";
    public static final String RC_CARS = "Carros a control remoto";
    public static final String[] CATEGORIES = new String[] {
        BIKES,
        WATER_GUNS,
        DOLLS,
        BEARS,
        TABLE_GAMES,
        RC_CARS
    };
    
    private Product[] products;
    
    public ProductsController() {
        
    }
    
    private void initializateProducts() {
        this.products = new Product[] {
            new Product(),
            new Product(),
            new Product(),
            new Product(),
        };
    }
    
}
