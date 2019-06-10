/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.OrderDetails;
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
public class OrderDetailsController {
    public boolean addOrderDetails(OrderDetails orderDetails){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(orderDetails);
        transaction.commit();
        return true;
    }
    
    public boolean updateOrderDetails(OrderDetails orderDetails){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(orderDetails);
        transaction.commit();
        return true;
    }
    
    public boolean deleteOrderDetails(int id){
        SessionFactory sessionFactory=HibernateUtil.getInstnce();
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        OrderDetails details=(OrderDetails) session.get(OrderDetails.class,id);
        session.delete(id);
        transaction.commit();
        return true;
    }
    
    public OrderDetails searchPayment(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        OrderDetails details=(OrderDetails) session.get(OrderDetails.class, id);
        transaction.commit();
        return details;
    }
     
    public List<OrderDetails> getAllPayment(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM OrderDetails";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
    
}
