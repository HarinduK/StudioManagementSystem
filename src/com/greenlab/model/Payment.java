/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Payment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cheqNo;
    private Date date;
    private double amount;
    private double paidAmount;
    private double balance;
    private int invoice_id;

    public Payment() {
    }

    public Payment(int id, Date date, double amount, double paidAmount, double balance, int invoice_id) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.invoice_id = invoice_id;
    }

    public Payment(Date date, Double amount, Double paidAmount, Double balance, Integer invoice_id) {
        this.date = date;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.invoice_id = invoice_id;
    }

    public Payment(Integer invoice_id, String cheqNo, Date date, Double amount, Double paidAmount, Double balance) {
       
        this.date = date;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.invoice_id = invoice_id;
        this.cheqNo = cheqNo;
    }

    public Payment(int id, String cheqNo, Date date, double amount, double paidAmount, double balance, int invoice_id) {
        this.id = id;
        this.cheqNo = cheqNo;
        this.date = date;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.invoice_id = invoice_id;
    }

    public Payment(Integer id, Integer invoice_id, String cheqNo, Date date, Double amount, Double paidAmount, Double balance) {
        this.id = id;
        this.invoice_id = invoice_id;
        this.cheqNo = cheqNo;
        this.date = date;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.balance = balance;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }
     public String getHeqNo() {
        return cheqNo;
    }

    public void setHeqNo(String heqNo) {
        this.cheqNo = heqNo;
    }
    
    
}
