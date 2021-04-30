package com.edm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edm.exception.EmployeeNotFoundException;
import com.edm.model.Employee;
import com.edm.repository.IEmployeeDao;
import com.edm.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmployeeControllerImpl implements IEmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@Autowired
	IEmployeeDao employeeDao;

	@Override
	@PostMapping("/addEmployee")
	public Employee createEmployee(Employee employee) {
		log.info("In method createEmployee");
		return employeeService.create(employee);
	}

	@Override
	@GetMapping("getEmployee/{name}")
	public ResponseEntity<List<Employee>> getEmployeeDetailsByName(@PathVariable("name") String name)
			throws EmployeeNotFoundException {
		log.info("In method getEmployeeDetailsByName");
		List<Employee> employees = employeeDao.getByName(name);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException("Employee with name : " + name + " is not found");
		}
		return ResponseEntity.ok().body(employees);
	}
}
