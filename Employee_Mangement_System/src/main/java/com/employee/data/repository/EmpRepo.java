package com.employee.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.data.entity.Employee;


@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{
	
	

}
