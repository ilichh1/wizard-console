package com.wizard.sell;

import com.wizard.product.SoldProduct;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilichh1
 */
public class Sell {
    
    private int saleman;
    private int client;
    private SoldProduct[] products;
    private LocalDate dateSold;
    
    public Sell() {
        this.saleman = -1;
        this.client = -1;
        this.products = null;
        this.dateSold = null;
    }
    
    public Sell(int salemanId, int clientWhoBuys, SoldProduct[] products, LocalDate dateSold) {
        this.saleman = salemanId;
        this.client = clientWhoBuys;
        this.products = products;
        this.dateSold = dateSold;
    }

    public int getSaleman() {
        return saleman;
    }

    public void setSaleman(int saleman) {
        this.saleman = saleman;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public SoldProduct[] getProducts() {
        return products;
    }

    public void setProducts(SoldProduct[] products) {
        this.products = products;
    }

    public LocalDate getDateSold() {
        return dateSold;
    }

    public void setDateSold(LocalDate dateSold) {
        this.dateSold = dateSold;
    }
}
