package com.example.Employee.model;

public class Employee {
    public Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(Long id, String designation, String name, double salary) {
        this.id = id;
        this.designation = designation;
        this.name = name;
        this.salary = salary;
    }

    public String name;
    public String designation;
    public double salary;
}
