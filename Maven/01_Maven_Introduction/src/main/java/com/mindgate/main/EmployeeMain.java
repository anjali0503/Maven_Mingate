package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeServiceInterface  employeeServiceInterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter ur id .....");
		int employee_id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter ur name ...");
		String name = scanner.nextLine();          
		System.out.println("enter ur salary");
		double salary= scanner.nextDouble();
		 Employee employee = new Employee(employee_id, name, salary);
		 boolean result = employeeServiceInterface.addNewEmployee(employee);
		 
		 if (result) {
			System.out.println("inserted successfully !!");
		}
		 else {
			System.out.println("insert fail");
		}
	}
}
 