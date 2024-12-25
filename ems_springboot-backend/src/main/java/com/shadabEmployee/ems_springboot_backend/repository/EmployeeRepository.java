package com.shadabEmployee.ems_springboot_backend.repository;

import com.shadabEmployee.ems_springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all CRUD database methods
}
