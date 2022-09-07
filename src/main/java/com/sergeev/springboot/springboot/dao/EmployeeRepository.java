package com.sergeev.springboot.springboot.dao;


import com.sergeev.springboot.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
