package com.softserve.edu07.hw.task1;

public abstract class Employee implements Payment {
    protected String employeeld;
    protected int payment;

    @Override
    public void calculatePay() {

    }

    public Employee(String employeeld, int payment) {
        this.employeeld = employeeld;
        this.payment = payment;
    }

    public abstract String getEmployeeld();

    public abstract int getPayment();
}
