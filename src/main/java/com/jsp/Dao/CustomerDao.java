package com.jsp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entitity.Customer;

public class CustomerDao {

	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void saveCustomer(Customer customer)
	{
		et.begin();
		em.persist(customer);
		et.commit();
	}
	
	public void updateCustomer(Customer customer) {
		et.begin();
		em.merge(customer);
		et.commit();
	}
	public void deleteCustomer(int id) {
		
		et.begin();
		em.remove(em.find(Customer.class,id));
		et.commit();
	
	}

}
