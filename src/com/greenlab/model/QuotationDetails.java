/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class QuotationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int invoice_id;
    private int product_id;
    private String description;
    private double item_price;
    private int qty;
    private double itemDiscount;
    private double amount;

    public QuotationDetails() {
    }

    public QuotationDetails(int id, int invoice_id, int product_id, String description, double item_price, int qty, double itemDiscount, double amount) {
        this.id = id;
        this.invoice_id = invoice_id;
        this.product_id = product_id;
        this.description = description;
        this.item_price = item_price;
        this.qty = qty;
        this.itemDiscount = itemDiscount;
        this.amount = amount;
    }

    public QuotationDetails(int invoice_id, int product_id, String description, double item_price, int qty, double itemDiscount, double amount) {
        this.invoice_id = invoice_id;
        this.product_id = product_id;
        this.description = description;
        this.item_price = item_price;
        this.qty = qty;
        this.itemDiscount = itemDiscount;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(double itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
