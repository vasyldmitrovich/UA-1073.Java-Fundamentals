package com.softserve.edu07.hw.task1;

public abstract class Employee implements Payment {
    protected String employeeld;//Make private and give name id not employeeId
    protected int payment;

    @Override
    public void calculatePay() {

    }

    public Employee(String employeeld, int payment) {
        this.employeeld = employeeld;
        this.payment = payment;
    }

    //And add getters and setters

    public abstract String getEmployeeld();

    public abstract int getPayment();
}
