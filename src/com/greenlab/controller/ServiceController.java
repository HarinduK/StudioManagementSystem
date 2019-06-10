/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.controller;

import com.greenlab.model.Service;
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
public class ServiceController {
    public boolean addService(Service service){
            SessionFactory sessionFactory = HibernateUtil.getInstnce();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            session.save(service);
            transaction.commit();
            return true;
    }
    
    public boolean updateService(Service service){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(service);
        transaction.commit();
        return true;
    }
    public boolean deleteService(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Service service = (Service) session.get(Service.class, id);
        session.delete(service);
        transaction.commit();
        return true;
    }
    public Service searchService(int id){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Service service = (Service) session.get(Service.class, id);
        transaction.commit();
        return service;
    }
    
    public List<Service> getAllServices(){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Service";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    public Service searchByName(String name){
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Service WHERE service = '"+name+"'";
        Query query = session.createQuery(hql);
        Service service=(Service) query.uniqueResult();
        transaction.commit();
        return service;
    }
    
}
