/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.Quotation;
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
public class QuotationController {
    public boolean addQuotation(Quotation quotation){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(quotation);
        transaction.commit();
        return true;
    }
    public boolean updateQuotation(Quotation quotation){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(quotation);
        transaction.commit();
        return true;
    }
    public boolean deleteQuotation(int id){
        SessionFactory sessionFactory=HibernateUtil.getInstnce();
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Quotation quotation=(Quotation) session.get(Quotation.class,id);
        session.delete(id);
        transaction.commit();
        return true;
    }
    public Quotation searchQuotation(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Quotation quotation=(Quotation) session.get(Quotation.class, id);
        transaction.commit();
        return quotation;
    }
    public List<Quotation> getAllQuatations(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Quotation";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public Quotation getLastQuotation(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Quotation ORDER BY id DESC";
        Query query = session.createQuery(hql).setMaxResults(1);
        Quotation quotation = (Quotation) query.uniqueResult();
        transaction.commit();
        return quotation;
    }
    
     public List<Quotation> searchByCustomerId(int custid){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Quotation WHERE customer_id = '"+custid+"'  ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
        
    }
}
