package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	List<Employee> getAllEmployees();
	
	boolean deleteEmployeeById(int employeeId);
//	public boolean updateEmployee(String name, int employeeId);
	
	Employee getEmployeeByEmployeeId(int employeeId);
	
	public boolean updateEmployee(Employee employee);
	
}
