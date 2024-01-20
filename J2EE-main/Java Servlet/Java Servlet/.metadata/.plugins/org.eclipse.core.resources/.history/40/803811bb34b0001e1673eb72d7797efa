package com.demo.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.model.Employee;
import com.demo.service.EmpServiceImpl;
import com.demo.service.EmpService;
@WebServlet("/addemp")
public class AddNewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id =Integer.parseInt(request.getParameter("eid")) ;
		String name=request.getParameter("ename");
		int sal = Integer.parseInt(request.getParameter("esal")) ;
		Employee e = new Employee(id,name,sal);
		EmpService eservice = new EmpServiceImpl();
		eservice.add(e);
		RequestDispatcher rs = request.getRequestDispatcher("employee");
		rs.forward(request, response);
		
		
	}

}
