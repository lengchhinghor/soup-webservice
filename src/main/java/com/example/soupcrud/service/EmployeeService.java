package com.example.soupcrud.service;

import com.example.soupcrud.entity.EmployeeEntity;

public interface EmployeeService {
    void AddEmployee(EmployeeEntity employee);

    EmployeeEntity getEmployeeById(Long employeeId);

    void updateEmployee(EmployeeEntity employee);

    void deleteEmployee(Long employeeId);
}
