package com.softserve.edu07.hw.Task1;

interface Payment {
    double calculatePay();
}

abstract class Employee {
    String employeeId;

    Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    abstract String getName();

    public double calculatePay() {
        return 0;
    }
}
