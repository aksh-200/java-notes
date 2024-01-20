package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		String s= "Hello from Controller";
		System.out.println("I am in hello");
		return new ModelAndView("myhello","msg",s);
	}
	
	
	
}
