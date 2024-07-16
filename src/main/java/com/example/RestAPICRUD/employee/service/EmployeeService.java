package com.example.RestAPICRUD.employee.service;

import com.example.RestAPICRUD.employee.entity.Employee;


import java.util.List;
import java.util.Optional;


public interface EmployeeService  {

    public List<Employee> findAll();

    public void deleteById(Integer id);

    public Employee save(Employee employee);

    public Optional<Employee> findById(Integer Id);
}
