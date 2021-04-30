package com.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edm.exception.EmployeeNotFoundException;
import com.edm.model.Employee;
import com.edm.repository.IEmployeeDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	IEmployeeDao employeeDao;
	
	@Override
	public Employee create(Employee employee) {
		log.info("In method create");
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) throws EmployeeNotFoundException {
		log.info("In method getEmployeeByName");
		List<Employee> employees = employeeDao.getByName(name);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException("Employee with name : " + name + " is not found");
		}
		return employeeDao.getByName(name);
	}
}