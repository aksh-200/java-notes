package com.demo.test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.demo.model.Product;

import java.util.List;

public class TestRetrieveProduct {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		Transaction tr = s1.beginTransaction();
		
		Criteria cr=s1.createCriteria(Product.class);
		List<Product> plist=cr.list();
		
		for(Product p : plist )
		{
			System.out.println(p);
		}
		
		System.out.println("********************");
		
		
		
		Criteria cr1 =s1.createCriteria(Product.class);
		Criterion pricegt=Restrictions.gt("price", 140);
		Criterion pricelt=Restrictions.lt("price", 9000);
		LogicalExpression lexpr =Restrictions.and(pricegt, pricelt);
		cr1.add(lexpr);
		
		
		
		
	List<Product> plist1=cr1.list();
		
		for(Product p : plist1 )
		{
			System.out.println(p);
		}
		
		
		System.out.println("********************");
		
		
		cr.setFirstResult(1);
		cr.setMaxResults(2);
		
		List<Product> plist3=cr.list();
		
		for(Product p : plist3 )
		{
			System.out.println(p);
		}
		
		
		
		
		
	}

}
