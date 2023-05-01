package com.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
