package com.softserve.edu07.hw.Task1;

public abstract class Employee implements Payment{
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee ID is '" + employeeld + '\'' +
                '}';
    }
}
