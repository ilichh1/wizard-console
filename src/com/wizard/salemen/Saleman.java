/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.salemen;

import com.wizard.abstracts.Person;

/**
 *
 * @author ilichh1
 */
public class Saleman extends Person {
    
    private static final int NORMAL = 0;
    private static final int ESPECIAL = 1;
    private static final int ESPECIAL_PLUS = 2;
    private static final double[] SALEMEN_COMISSIONS = new double[] {
        0.03,
        0.05,
        0.10
    };
    private static final String[] SALEMEN_TYPES = new String[] {
        "Normal",
        "Especial",
        "Especial Plus"
    };
    
    
    int ventasPrevias;
    
    public Saleman() {
        super();
    }

    @Override
    public String[] getAskableFieldNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
