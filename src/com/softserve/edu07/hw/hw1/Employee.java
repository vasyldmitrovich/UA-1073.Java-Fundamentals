package com.softserve.edu07.hw.hw1;

public abstract class Employee implements Payment{
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

}
