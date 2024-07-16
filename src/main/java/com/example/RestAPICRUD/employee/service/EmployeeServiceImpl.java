package com.example.RestAPICRUD.employee.service;

import com.example.RestAPICRUD.employee.entity.Employee;
import com.example.RestAPICRUD.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // we need to make attribute for Repository
    @Autowired
    private EmployeeRepository employeeRepository;

    // we need to make constructor in order to make inject the EmployeeRepository
    // this class
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        this.employeeRepository = theEmployeeRepository;
    }


    @Override

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override

    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(Integer Id) {
        Optional<Employee> returnedValue = employeeRepository.findById(Id);
        return returnedValue;
    }


}
