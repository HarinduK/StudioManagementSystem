/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Service implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int service_id;
    private String service;
    private double price;
    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Invoice_Service",
//            joinColumns = {@JoinColumn(name = "service_id")},
//            inverseJoinColumns = {@JoinColumn(name = "invoice_id")})
    private Set<Invoice> invoices=new HashSet<>();

    public Service() {
    }

    public Service(int id, String service, double price) {
        this.service_id = id;
        this.service = service;
        this.price = price;
    }

    public Service(String descripton, Double selingPrice) {
        this.service = descripton;
        this.price = selingPrice;
    }

    


    public int getId() {
        return service_id;
    }

    public void setId(int id) {
        this.service_id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
