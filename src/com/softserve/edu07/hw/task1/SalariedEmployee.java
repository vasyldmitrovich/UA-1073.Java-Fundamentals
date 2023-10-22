package com.softserve.edu07.hw.task1;

class SalariedEmployee extends Employee {
    String socialSecurityNumber;//The same
    double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String employeeName, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, employeeName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}