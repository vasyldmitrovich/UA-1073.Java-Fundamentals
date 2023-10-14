package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee {
    private int workHours;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeld, int payment, int workHours, String socialSecurityNumber) {
        super(employeeld, payment);
        this.workHours = workHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String getEmployeeld() {
        return employeeld;
    }
    @Override
    public int getPayment() {
        return payment;
    }

    public int getWorkHours() {
        return workHours;
    }

    @Override
    public void calculatePay() {
        System.out.println("Payment: " + getWorkHours()*getPayment());
    }
}