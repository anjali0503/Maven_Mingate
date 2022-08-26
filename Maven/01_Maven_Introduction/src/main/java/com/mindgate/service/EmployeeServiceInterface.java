package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceInterface {
	boolean addNewEmployee(Employee employee);
	List<Employee> getAllEmployees();
	boolean deleteEmployeeById(int employeeId);
//	public boolean updateEmployee(String name, int employeeId);
	
	Employee getEmployeeByEmployeeId(int employeeId);
	public boolean updateEmployee(Employee employee);
}
