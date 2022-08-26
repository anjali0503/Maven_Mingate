package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int empId;
		String name;
		double salary;
		
		empId = Integer.valueOf(request.getParameter("id"));
		name = request.getParameter("name");
		salary = Double.valueOf(request.getParameter("salary"));
		
//		PrintWriter printWriter = response.getWriter();
//		
//		printWriter.println("EmployeeId : "+empId);
//		printWriter.println("Name : "+name);
//		printWriter.println("Salary :"+salary);
		
		Employee employee =  new Employee(empId, name, salary);
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		
		boolean result = employeeServiceInterface.addNewEmployee(employee);
		
		if(result) {
			response.sendRedirect("index.jsp");
		}
		else {
			PrintWriter printWriter = response.getWriter();
			printWriter.println("Falied adding Employee!!!");
		}
		
	}

}
