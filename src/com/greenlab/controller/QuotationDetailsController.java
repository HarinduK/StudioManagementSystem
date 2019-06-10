/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.QuotationDetails;
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
public class QuotationDetailsController {
    
    public boolean addQuotationDetails(QuotationDetails quotationDetails){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(quotationDetails);
        transaction.commit();
        return true;
    }
    
    public boolean updatequotationDetails(QuotationDetails quotationDetails){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(quotationDetails);
        transaction.commit();
        return true;
    }
    
    public boolean deleteQuotationDetails(int id){
        SessionFactory sessionFactory=HibernateUtil.getInstnce();
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        QuotationDetails details=(QuotationDetails) session.get(QuotationDetails.class,id);
        session.delete(id);
        transaction.commit();
        return true;
    }
    
    public QuotationDetails searchQuotationDetails(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        QuotationDetails details=(QuotationDetails) session.get(QuotationDetails.class, id);
        transaction.commit();
        return details;
    }
     
    public List<QuotationDetails> getAllQuotationDetails(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM QuotationDetails";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public List<QuotationDetails> searchByQuotations(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM QuotationDetails WHERE invoice_id = '"+id+"'  ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
        
    }
    
}
