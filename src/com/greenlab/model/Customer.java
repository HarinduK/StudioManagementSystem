/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Customer implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String telphone1;
    private String telphone2;
    private String telphone3;
    private String email;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Invoice> invoiceList;

    public Customer() {
    }

    public Customer(int id, String name, String address, String telphone1, String telphone2, String telphone3, String email, List<Invoice> invoiceList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telphone1 = telphone1;
        this.telphone2 = telphone2;
        this.telphone3 = telphone3;
        this.email = email;
        this.invoiceList = invoiceList;
    }

    public Customer(String name, String address, String telphone1, String telphone2, String telphone3, String email) {
        this.name = name;
        this.address = address;
        this.telphone1 = telphone1;
        this.telphone2 = telphone2;
        this.telphone3 = telphone3;
        this.email = email;
    }

    public Customer(int id, String name, String address, String telphone1, String telphone2, String telphone3, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telphone1 = telphone1;
        this.telphone2 = telphone2;
        this.telphone3 = telphone3;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
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

    public String getTelphone1() {
        return telphone1;
    }

    public void setTelphone1(String telphone1) {
        this.telphone1 = telphone1;
    }

    public String getTelphone2() {
        return telphone2;
    }

    public void setTelphone2(String telphone2) {
        this.telphone2 = telphone2;
    }

    public String getTelphone3() {
        return telphone3;
    }

    public void setTelphone3(String telphone3) {
        this.telphone3 = telphone3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
