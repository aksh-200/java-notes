package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;

public class TestRetrieveData {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		 
	  Address a1 = s1.get(Address.class, 1);
	  
	  System.out.println(a1);
	  
	  
		tr.commit();
		
		
	}

}
