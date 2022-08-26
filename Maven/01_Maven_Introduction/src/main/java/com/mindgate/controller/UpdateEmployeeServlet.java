package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	int employeeId;
	String name;
	double salary;
	
	employeeId = Integer.valueOf(request.getParameter("id"));
	name= request.getParameter("name");
	salary = Double.valueOf(request.getParameter("salary"));
	
	System.out.println("in updateemployeeservlet");
	
	Employee employee = new Employee(employeeId, name, salary);
	System.out.println(employee);
	
	
	EmployeeServiceInterface employeeServiceInterface  = new EmployeeService();
	boolean result = employeeServiceInterface.updateEmployee(employee);
	
	if(result) {
		response.sendRedirect("index.jsp");
	}
	else {
		{
			PrintWriter printWriter = response.getWriter()	;
			printWriter.print("Failed to update");
		}
	}
	
	}

}
