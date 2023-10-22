package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee {
    private final double monthlySalary;
    private final String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}