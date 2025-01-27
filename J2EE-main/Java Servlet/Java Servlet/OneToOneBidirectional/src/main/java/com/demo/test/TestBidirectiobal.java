package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestBidirectiobal {

	public static void main(String[] args) {
		Address A1 = new Address(1,"camp","Pune");
		Address A2 = new Address(2,"CollegeRoad","Pune");
		
		MyUser U1 = new MyUser(1,"Tushar",A1);
		MyUser U2 = new MyUser(2,"Usama",A2);
		
		A1.setU(U1);
		A2.setU(U2);
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr1=s1.beginTransaction();
		
		s1.saveOrUpdate(A1);
		s1.saveOrUpdate(A2);
		s1.saveOrUpdate(U1);
		s1.saveOrUpdate(U2);
		
		tr1.commit();
		s1.close();
		sf.close();
		
		
	}
}
