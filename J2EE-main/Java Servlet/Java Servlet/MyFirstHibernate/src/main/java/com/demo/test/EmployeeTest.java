package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		//it is in transient state
		Employee e1=new Employee(14,"Sahil",3456);
		Employee e2=new Employee(15,"Akash",5555);
		Employee e3=new Employee(17,"Tanaya",4545);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//e1 is in persistent state
		session.save(e1);
		session.save(e2);
			tr.commit();
		session.close();
	
		
		//Retrive data & BASIC UPDATE
		
		Session sess1=sf.openSession();
		Transaction tr1=sess1.beginTransaction();
		Employee emp1=sess1.get(Employee.class, 15);
		System.out.println(emp1.getEname());
	
		emp1.setEname("bhushan");
		
	  sess1.update(emp1);
		tr1.commit();
		sess1.close();
		sf.close();
		
		
	}

}