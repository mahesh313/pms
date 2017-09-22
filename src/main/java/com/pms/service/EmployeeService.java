package com.pms.service;

import com.pms.exception.EmployeeNotFoundException;
import com.pms.model.Employee;
import com.pms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @Cacheable(value = "employees", key = "#id")
    public Employee findEmployee(Integer id) {

        Employee employee = employeeRepository.findOne(id);
        if(employee == null){
            throw new EmployeeNotFoundException(id, "Employee not Found");
        }
        return employee;
    }

    public Employee findEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Transactional
    public void removeEmployee(Integer id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
