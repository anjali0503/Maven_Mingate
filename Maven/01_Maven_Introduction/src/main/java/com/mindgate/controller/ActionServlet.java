package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int  emplyoyeeId;
		
		emplyoyeeId = Integer.valueOf(request.getParameter("action"));
		PrintWriter printWriter = response.getWriter();
//		printWriter.println("EmplyeeoId :: " +emplyoyeeId);
		
			EmployeeServiceInterface employeeServiceInterface = new EmployeeService()	;
			
		String choice =  request.getParameter("operation");
		switch (choice) {
		case "Delete":
 boolean result = employeeServiceInterface.deleteEmployeeById(emplyoyeeId);
			 
			 if (result) {
				response.sendRedirect("index.jsp");
			}
			 else {
				printWriter.println("Delete failed");
			}
			break;
		case "Update":
			Employee employee = employeeServiceInterface.getEmployeeByEmployeeId(emplyoyeeId);
			System.out.println(employee);
				HttpSession httpSession = request.getSession()	;
				httpSession.setAttribute("emp", employee);
			
			response.sendRedirect("updateemployee.jsp");
			
			break;
		default:
			break;
		}
	}

}
