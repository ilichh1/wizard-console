/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.abstracts;

import com.wizard.interfaces.Registrable;
import java.util.Date;

/**
 *
 * @author ilichh1
 */
public abstract class Person implements Registrable {
    
    private Date registeredDate;
    private Date modifiedDate;
    
    private int id;
    private String name;
    private String surname;
    
    public Person () {
        this.id = -1;
        this.name = null;
        this.surname = null;
        this.registeredDate = null;
        this.modifiedDate = null;
    }
    
    public Person (int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    
    public Person (int id, String name, String surname, Date registeredDate, Date modifiedDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.registeredDate = registeredDate;
        this.modifiedDate = modifiedDate;
    }

    @Override
    public Date getRegisteredDate() {
        return registeredDate;
    }
    
    @Override
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    
    @Override
    public Date getModifiedDate() {
        return modifiedDate;
    }
    
    @Override
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
}
