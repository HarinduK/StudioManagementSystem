/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author zeonit
 */@Entity
public class ResivedPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    private String cheqNo;
    private Double paidAmount;
    private Double Balance;

    
    

    @OneToOne(cascade = CascadeType.MERGE)
    private Customer customer;
    @OneToOne(cascade = CascadeType.ALL)
    private Invoice invoice;

    public ResivedPayment() {
    }

    public ResivedPayment(Integer id, Date date, String cheqNo, Double paidAmount, Customer customer, Invoice invoice,Double balance) {
       // this.id = id;
        this.date = date;
        this.cheqNo = cheqNo;
        this.paidAmount = paidAmount;
        this.customer = customer;
        this.invoice = invoice;
        this.Balance = balance;
    }

    public ResivedPayment(Date date, String cheqNo, Double amount, Customer customer, Invoice invoice,Double balance ) {
        
        this.date = date;
        this.cheqNo = cheqNo;
        this.paidAmount = amount;
        this.customer = customer;
        this.invoice = invoice;
        this.Balance = balance;
    }

    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCheqNo() {
        return cheqNo;
    }

    public void setCheqNo(String cheqNo) {
        this.cheqNo = cheqNo;
    }
    
     public Double getAmount() {
        return paidAmount;
    }

    public void setAmount(Double Amount) {
        this.paidAmount = Amount;
    }
    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }
    
    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    
}
