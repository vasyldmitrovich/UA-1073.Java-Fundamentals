package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;
    private final String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
