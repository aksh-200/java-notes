package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUserAddress {

	
	
	public static void main(String[] args) {
		Address add1= new Address(1,"Baner","Pune");
		Address add2 = new Address(2,"deccan","pune");
		
		MyUser u1 = new MyUser(10,"Bhushan",add1);
		MyUser u2 = new MyUser(11,"Akshay",add2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session1 = sf.openSession();
		Transaction tra1 = session1.beginTransaction();
		session1.save(u1);
		session1.save(u2);
		tra1.commit();
		session1.close();
		sf.close();
		
		
		
		
		
		
		
		
	}
}