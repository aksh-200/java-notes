package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class TestAddProduct {
	
	public static void main(String[] args) {
		Product p1 =new Product(1,"Harsh",10,150); 
		Product p2 =new Product(2,"laptop",45,150000); 
		Product p3 =new Product(3,"chair",15,1450); 
		Product p4 =new Product(4,"Mobile",80,8550); 
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s1=sf.openSession();
	Transaction tr=s1.beginTransaction();
	
	s1.save(p1);
	s1.save(p2);
	s1.save(p3);
	s1.save(p4);
	tr.commit();
	
	
	}
		

}
