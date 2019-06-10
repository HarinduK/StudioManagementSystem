/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.Invoice;
import com.greenlab.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Zeon-IT
 */
public class InvoiceController {
    
    public boolean addInvoice(Invoice invoice){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(invoice);
        transaction.commit();
        return true;
    }
    public boolean updateInvoice(Invoice invoice){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(invoice);
        transaction.commit();
        return true;
    }
    public boolean deleteInvoice(int id){
        SessionFactory sessionFactory=HibernateUtil.getInstnce();
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Invoice invoice=(Invoice) session.get(Invoice.class,id);
        session.delete(id);
        transaction.commit();
        return true;
    }
    public Invoice searchInvoice(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Invoice invoice=(Invoice) session.get(Invoice.class, id);
        transaction.commit();
        return invoice;
    }
    public List<Invoice> getAllInvoices(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Invoice";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public Invoice getLastInvoice(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Invoice ORDER BY invoice_id DESC";
        Query query = session.createQuery(hql).setMaxResults(1);
        Invoice invoice = (Invoice) query.uniqueResult();
        transaction.commit();
        return invoice;
    }
    
     public List<Invoice> searchByCustomerId(int custid){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Invoice WHERE customer_id = '"+custid+"'  ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
        
    }
   
    
}
