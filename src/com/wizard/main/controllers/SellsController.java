/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.main.controllers;

import com.wizard.product.SoldProduct;
import com.wizard.sell.Sell;
import com.wizard.utils.ConsoleUtils;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ilichh1
 */
public class SellsController {
    private final ArrayList<Sell> sells = new ArrayList<>();
    private static final String[] COLUMN_HEADERS = new String[] {
        "ID",
        "Vendedor",
        "Cliente",
        "No. productos",
        "Total",
        "Fecha vendido"
    };
    
    public SellsController() {
        this.initializateSellsController();
    }
    
    private void initializateSellsController() {
        this.sells.addAll(Arrays.asList(new Sell[] {
            new Sell(0, 0, new SoldProduct[] {
                new SoldProduct("Mistery Van", 149.99, 2),
                new SoldProduct("Triciclo Apache", 4999.99, 1),
                new SoldProduct("Action Man", 499.99, 3),
                new SoldProduct("Sooby Doo", 215.50, 5)
            }, LocalDate.of(2018, 12, 1)),
            new Sell(1, 0, new SoldProduct[] {
                new SoldProduct("Mistery Van", 149.99, 1),
                new SoldProduct("Triciclo Apache", 4999.99, 1),
                new SoldProduct("Action Man", 499.99, 1),
                new SoldProduct("Sooby Doo", 215.50, 1)
            }, LocalDate.of(2018, 12, 2)),
            new Sell(2, 0, new SoldProduct[] {
                new SoldProduct("Mistery Van", 149.99, 1),
                new SoldProduct("Action Man", 499.99, 3),
                new SoldProduct("Sooby Doo", 215.50, 2)
            }, LocalDate.of(2018, 11, 30)),
            new Sell(3, 1, new SoldProduct[] {
                new SoldProduct("Mistery Van", 149.99, 1),
                new SoldProduct("Triciclo Apache", 4999.99, 3)
            }, LocalDate.of(2018, 10, 29)),
            new Sell(4, 0, new SoldProduct[] {
                new SoldProduct("Mistery Van", 149.99, 2),
                new SoldProduct("Triciclo Apache", 4999.99, 1),
                new SoldProduct("Action Man", 499.99, 3),
                new SoldProduct("Sooby Doo", 215.50, 5)
            }, LocalDate.of(2018, 12, 4))
        }));
    }
    
    public void printTable() {
        Sell[] sellsArray = this.sells.toArray(new Sell[this.sells.size()]);
        ConsoleUtils.printAsTable(sellsArray, COLUMN_HEADERS);
    }
    
}
