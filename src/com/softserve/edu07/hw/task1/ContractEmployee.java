package com.softserve.edu07.hw.task1;

class ContractEmployee extends Employee {
    String federalTaxId;//Why this fields have default access modifier do private and add getters and setters
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String employeeId, String employeeName, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}