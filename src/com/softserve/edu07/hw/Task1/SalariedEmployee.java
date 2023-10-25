package com.softserve.edu07.hw.Task1;

class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double fixedMonthlyPayment;

    SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    String getName() {
        return "Salaried Employee";
    }
}
