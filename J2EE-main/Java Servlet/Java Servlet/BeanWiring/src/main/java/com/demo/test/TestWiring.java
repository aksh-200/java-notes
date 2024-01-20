package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.MyUSer;

public class TestWiring {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		MyUSer user1 = (MyUSer) ctx.getBean("u1");
		System.out.println(user1);
	}
	
}
