package com.softserve.edu07.hw.task1;

abstract class Employee {

    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    abstract String getEmployeeInfo();

    abstract double calculatePay();
}
