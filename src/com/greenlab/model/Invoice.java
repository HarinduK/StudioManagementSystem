/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Invoice implements Serializable{
    @Id
    @SequenceGenerator(initialValue = 10000,name = "invoice_num",allocationSize = 1)
    @GeneratedValue(generator = "invoice_num")
    private int invoice_id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private double total;
    private double totalDiscount;
    private double netTotal;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Payment> paymentList;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Service> services=new HashSet<Service>();
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> products=new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetailseList;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    
    public Invoice() {
    }

    public Invoice(int invoice_id, Date date, double total, double totalDiscount, double netTotal, List<Payment> paymentList, List<OrderDetails> orderDetailseList, Customer customer) {
        this.invoice_id = invoice_id;
        this.date = date;
        this.total = total;
        this.totalDiscount = totalDiscount;
        this.netTotal = netTotal;
        this.paymentList = paymentList;
        this.orderDetailseList = orderDetailseList;
        this.customer = customer;
    }

    
    public Invoice(Date date, Double total, Double discountAmount, Double netTotal, ArrayList<OrderDetails> detailsList, Customer customer) {
        this.date = date;
        this.total = total;
        this.totalDiscount = discountAmount;
        this.netTotal = netTotal;
        this.orderDetailseList = detailsList;
        this.customer = customer;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public List<OrderDetails> getOrderDetailseList() {
        return orderDetailseList;
    }

    public void setOrderDetailseList(List<OrderDetails> orderDetailseList) {
        this.orderDetailseList = orderDetailseList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    

    

   

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
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
    
    public int getId() {
        return invoice_id;
    }

    public void setId(int id) {
        this.invoice_id = id;
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
 
    
}
