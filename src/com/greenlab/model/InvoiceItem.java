/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

/**
 *
 * @author Zeon-IT
 */
public class InvoiceItem {
    private String item;
    private double qty;
    private double discount;
    private double amount;

    public InvoiceItem() {
    }

    public InvoiceItem(String item, double qty, double discount, double amount) {
        this.item = item;
        this.qty = qty;
        this.discount = discount;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
