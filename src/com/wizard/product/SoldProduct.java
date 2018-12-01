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
public class SoldProduct {
    String name;
    double price;
    int amount;
    
    public SoldProduct (String nm, double pr, int amt) {
        this.name = nm;
        this.price = pr;
        this.amount = amt;
    }
    
    public double getTotal() {
        return Double.parseDouble(Integer.toString(this.amount)) * this.price;
    }
}
