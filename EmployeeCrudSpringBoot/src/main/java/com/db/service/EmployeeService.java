package com.db.service;

import java.util.List;

import com.db.entity.Employee;

public interface EmployeeService {

	public Integer saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee getOneEmployee(int id);
	public List<Employee> getAllEmployees();
	
}
