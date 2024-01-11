package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

/**
 * Servlet implementation class UpdateEmpServlet
 */
@WebServlet("/Update")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(request.getParameter("empid"));
		String name = request.getParameter("ename");
		int sal = Integer.parseInt(request.getParameter("sal"));
		
		Employee   e = new Employee(id,name,sal);
		System.out.println(e);
		EmpService eservice = new EmpServiceImpl();
		eservice.modify(e);
		RequestDispatcher rd = request.getRequestDispatcher("employee");
		rd.forward(request, response);
		
		
	}

}
