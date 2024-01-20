package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.HelloWorld;
import com.demo.model.MyUser;

public class TestHello {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		//ApplicationContext build singleton objects of all classes when it run first time
		
		
		//As scope of this class in bean is prototype so default constructor is exevutr only when 
		// we use getBean method
		
		HelloWorld hello = (HelloWorld) ctx.getBean("hw");
		
		//hello.sayHello();
		
		MyUser user1 = (MyUser) ctx.getBean("u1");
		
		System.out.println(user1);
		
		
		
		
	}

}
