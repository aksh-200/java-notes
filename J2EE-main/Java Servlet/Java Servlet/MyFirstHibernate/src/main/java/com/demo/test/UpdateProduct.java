package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class UpdateProduct {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses1 = sf.openSession();
		Transaction tr=ses1.beginTransaction();
		Product p1 = ses1.get(Product.class, 1); //Persistent
		ses1.close();
		p1.setPname("car");
		
		
		
		Session ses2 = sf.openSession();
		Transaction tr2=ses2.beginTransaction();
		Product p2 = ses2.get(Product.class, 1);
//		p2.setPname("laptop");
		//ses2.update(p2);
		ses2.merge(p1);
		tr2.commit();
		ses2.close();
		sf.close();
	}

}
