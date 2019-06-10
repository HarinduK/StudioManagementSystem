/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Quotation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date date;
    private double total;
    private double totalDiscount;
    private double netTotal;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Service> services=new HashSet<Service>();
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> products=new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<QuotationDetails> quotationDetailsesList;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Quotation() {
    }

    public Quotation(int id, Date date, double total, double totalDiscount, double netTotal, List<QuotationDetails> quotationDetailsesList, Customer customer) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.totalDiscount = totalDiscount;
        this.netTotal = netTotal;
        this.quotationDetailsesList = quotationDetailsesList;
        this.customer = customer;
    }

    public Quotation(Date date, Double total, Double discountAmount, Double netTotal, ArrayList<QuotationDetails> detailsList, Customer customer) {
        this.date = date;
        this.total = total;
        this.totalDiscount = discountAmount;
        this.netTotal = netTotal;
        this.quotationDetailsesList = detailsList;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public List<QuotationDetails> getQuotationDetailsesList() {
        return quotationDetailsesList;
                
               
    }

    public void setQuotationDetailsesList(List<QuotationDetails> quotationDetailsesList) {
        this.quotationDetailsesList = quotationDetailsesList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
