/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.Product;
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
public class ProductController {
    
     public boolean addProduct(Product product){
            SessionFactory sessionFactory = HibernateUtil.getInstnce();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
            return true;
    }
    
    public boolean updateProduct(Product product){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        return true;
    }
    public boolean deleteProduct(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Product product = (Product) session.get(Product.class, id);
        session.delete(product);
        transaction.commit();
        return true;
    }
    public Product searchProduct(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Product product = (Product) session.get(Product.class, id);
        transaction.commit();
        return product;
    }
    
    public List<Product> getAllProduct(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Product";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public Product searchByName(String name){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Product WHERE description = '"+name+"'";
        Query query = session.createQuery(hql);
        Product product = (Product) query.uniqueResult();
        transaction.commit();
        return product;
    }
    
}
