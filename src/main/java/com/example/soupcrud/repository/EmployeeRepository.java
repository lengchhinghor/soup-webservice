package com.example.soupcrud.repository;

import com.example.soupcrud.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


    EmployeeEntity findByEmployeeId(long employeeId);

    Boolean existsByName(String name);

}