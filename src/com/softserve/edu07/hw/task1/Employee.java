package com.softserve.edu07.hw.task1;

abstract class Employee {//Implement interphase here
    String employeeId;
    String employeeName;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public abstract double calculatePay();
}