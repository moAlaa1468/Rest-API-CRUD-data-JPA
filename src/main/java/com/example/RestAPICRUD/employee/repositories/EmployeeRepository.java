package com.example.RestAPICRUD.employee.repositories;

import com.example.RestAPICRUD.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// you have to use This annotation
// And give the JpaRepository class the name of the entity and id type
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // You will not to write any code here
    // because JpaReository class contains
    // all the crud operation that you will need
}

