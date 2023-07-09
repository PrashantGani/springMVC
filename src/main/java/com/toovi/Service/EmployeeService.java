package com.toovi.Service;

import java.util.List;

import com.toovi.Entity.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void deleteById(long id);

	Employee updateEmployeeById(long id);

	Employee getEmployeeById(long id);
}
