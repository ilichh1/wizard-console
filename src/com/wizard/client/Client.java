/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.client;

import com.wizard.abstracts.Person;
import java.util.Date;

/**
 *
 * @author ilichh1
 */
public class Client extends Person {
    
    private String phone;
    private String email;
    private String address;
    
    public Client(int id, String name, String surname, Date registeredDate, Date modifiedDate, String phone, String email, String address) {
        // TODO: Validar los tipos de datos y formato de datos
        super(id, name, surname, registeredDate, modifiedDate);
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
