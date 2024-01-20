package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	
	static SessionFactory sf ;
	
	static SessionFactory getMySessionFactory()
	{
		if(sf== null)
		{
			sf = new Configuration().configure().buildSessionFactory();
			
		}
		
		return sf;
	}

	
	static void closeMySessioFactory()
	{
		if(sf!=null)
		{
			sf.close();
		}
	}
}
