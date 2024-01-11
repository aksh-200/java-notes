package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.EmpServiceImpl;
import com.demo.model.Employee;
import com.demo.service.EmpService;


@WebServlet("/editemp")
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EditEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empid =Integer.parseInt(request.getParameter("eid"));
		
		EmpService eservice = new EmpServiceImpl();
		Employee emp = eservice.getById(empid);
		request.setAttribute("emp", emp);
		RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
		
		
		
		
		
		
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
