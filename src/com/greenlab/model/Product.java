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
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_id;
    private String partNo;
    private double qty;
    private String description;
    private double cost;
    private double sellingPrice;
    
    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Invoice_Product",
//            joinColumns = {@JoinColumn(name = "product_id")},
//            inverseJoinColumns = {@JoinColumn(name = "invoice_id")})
    private Set<Invoice> invoices=new HashSet<>();

    public Product() {
    }

    public Product(int product_id, String partNo, double qty, String description, double cost, double sellingPrice) {
        this.product_id = product_id;
        this.partNo = partNo;
        this.qty = qty;
        this.description = description;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
    }

    public Product(String partNo, String descripton, Double qty, Double cost, Double selingPrice) {
        this.partNo = partNo;
        this.qty = qty;
        this.description = descripton;
        this.cost = cost;
        this.sellingPrice = selingPrice;
    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }

    
    
    
}
