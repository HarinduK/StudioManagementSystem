/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.Payment;
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
public class PaymentController {
    
    public boolean addPayment(Payment payment){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(payment);
        transaction.commit();
        return true;
    }
    public boolean updatePayment(Payment payment){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(payment);
        transaction.commit();
        return true;
    }
    public boolean deletePayment(int id){
        SessionFactory sessionFactory=HibernateUtil.getInstnce();
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Payment payment=(Payment) session.get(Payment.class,id);
        session.delete(id);
        transaction.commit();
        return true;
    }
     public Payment searchPayment(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Payment payment=(Payment) session.get(Payment.class, id);
        transaction.commit();
        return payment;
    }
     
    public List<Payment> getAllPayment(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Payment";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public List<Payment> searchPaymentwithInvId(int invoice_id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Payment WHERE invoice_id = '"+invoice_id+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
        
    }
    
}
