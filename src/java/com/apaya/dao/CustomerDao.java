/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apaya.dao;

import com.apaya.entity.Customer;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class CustomerDao {

    static final Logger logger = Logger.getLogger(CustomerDao.class.getName());

    @PersistenceUnit
    EntityManagerFactory emf;

    private EntityManager em;
    
   public void addCustomer(Customer cust){
    em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(cust);
    em.getTransaction().commit();
    em.close();
    }

    public List<Customer> showAllCustomer() {
        setEm(emf.createEntityManager());
        Query query = getEm().createNamedQuery("Customer.findAll");
        List<Customer> cust = query.getResultList();
        return cust;
    }

    public Customer findBy(Integer id) {
        em = emf.createEntityManager();
        Query query = em.createNamedQuery("Customer.findByCustomerId");
        query.setParameter("customerId", id);
        Customer cust = (Customer) query.getSingleResult();
        return cust;

    }
    
   
    
    

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
