package com.example.Employee.service;

import com.example.Employee.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private Employee employee; // Only one employee stored at a time

    public String addEmployee(Employee newEmployee) {
        if (employee != null && employee.getId().equals(newEmployee.getId())) {
            return "Employee with this ID already exists";
        }
        employee = newEmployee;
        return "Employee added successfully";
    }

    public String updateEmployee(Employee updatedEmployee) {
        if (employee == null || !employee.getId().equals(updatedEmployee.getId())) {
            return "Employee not found";
        }
        employee = updatedEmployee;
        return "Employee updated successfully";
    }

    public String deleteEmployee(Long id) {
        if (employee == null || !employee.getId().equals(id)) {
            return "Employee not found";
        }
        employee = null;
        return "Employee deleted successfully";
    }

    public Employee getEmployeeById(Long id) {
        if (employee != null && employee.getId().equals(id)) {
            return employee;
        }
        return null; // Employee not found
    }

    public String increaseSalary(Long id, double percentage) {
        if (employee != null && employee.getId().equals(id)) {
            double raiseAmount = employee.getSalary() * (percentage / 100);
            employee.setSalary(employee.getSalary() + raiseAmount);
            return "Salary increased by " + percentage + "% successfully. New salary: " + employee.getSalary();
        }
        return "Employee not found";
    }
}
