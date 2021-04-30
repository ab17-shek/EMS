package com.edm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.edm.exception.EmployeeNotFoundException;
import com.edm.model.Employee;

public interface IEmployeeController {
	
	public Employee createEmployee(@RequestBody Employee employee);
	
	public ResponseEntity<List<Employee>> getEmployeeDetailsByName(@PathVariable("name") String name)
			throws EmployeeNotFoundException;
}
