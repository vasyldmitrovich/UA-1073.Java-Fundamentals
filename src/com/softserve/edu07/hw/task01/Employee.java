package com.softserve.edu07.hw.task01;

public abstract class Employee {
    private String employeeId;
    private String name;

    public Employee() {
        this.employeeId = null;
        this.name = null;
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
