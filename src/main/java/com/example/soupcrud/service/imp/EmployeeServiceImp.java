package com.example.soupcrud.service.imp;

import com.example.soupcrud.entity.EmployeeEntity;
import com.example.soupcrud.repository.EmployeeRepository;
import com.example.soupcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void AddEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity getEmployeeById(Long employeeId) {

        EmployeeEntity employee = employeeRepository.findByEmployeeId(employeeId);
        return employee;
    }

    @Override
    public void updateEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
