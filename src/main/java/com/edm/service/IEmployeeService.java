package com.edm.service;

import java.util.List;

import com.edm.exception.EmployeeNotFoundException;
import com.edm.model.Employee;

public interface IEmployeeService {

	Employee create(Employee employee);
	
	List<Employee> getEmployeeByName(String name) throws EmployeeNotFoundException;

}
