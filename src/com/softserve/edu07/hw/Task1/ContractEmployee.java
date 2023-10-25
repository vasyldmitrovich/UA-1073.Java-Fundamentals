package com.softserve.edu07.hw.Task1;

class ContractEmployee extends Employee implements Payment {
    String federalTaxId;
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    String getName() {
        return "Contract Employee";
    }
}
