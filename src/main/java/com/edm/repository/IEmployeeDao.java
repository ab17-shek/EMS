package com.edm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edm.model.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer>{
	
	@Query("SELECT e FROM Employee e WHERE e.firstName =:n ORDER BY age")
	List<Employee> getByName(@Param("n") String name);
}
