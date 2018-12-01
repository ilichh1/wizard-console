package com.wizard.sell;

import com.wizard.client.Client;
import com.wizard.interfaces.Registrable;
import com.wizard.product.SoldProduct;
import java.time.LocalDate;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilichh1
 */
public class Sell implements Registrable {
    
    String saleman;
    Client client;
    SoldProduct[] products;
    double total;
    
    private LocalDate registeredDate;
    private LocalDate modifiedDate;
    
    public Sell() {
        
    }
    
    @Override
    public void setRegisteredDate(Date registeredDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getRegisteredDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getModifiedDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
