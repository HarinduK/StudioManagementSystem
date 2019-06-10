/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.Customer;
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
public class CustomerController {
    
    
    public boolean addCustomer(Customer customer){
            SessionFactory sessionFactory = HibernateUtil.getInstnce();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
            return true;
    }
    
    public boolean updateCustomer(Customer customer){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        return true;
    }
    public boolean deleteCustomer(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = (Customer) session.get(Customer.class, id);
        session.delete(customer);
        transaction.commit();
        return true;
    }
    public Customer searchCustomer(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = (Customer) session.get(Customer.class, id);
        transaction.commit();
        return customer;
    }
    
    public List<Customer> getAllCustomer(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public Customer searchByName(String name){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer WHERE name = '"+name+"'";
        Query query = session.createQuery(hql);
        Customer customer=(Customer) query.uniqueResult();
        transaction.commit();
        return customer;
    }
    public Customer getByName(String name){
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer WHERE name = '"+name+"'";
        Query query = session.createQuery(hql);
        Customer customer = (Customer) query.uniqueResult();
        transaction.commit();
        return customer;
    }
    
}
