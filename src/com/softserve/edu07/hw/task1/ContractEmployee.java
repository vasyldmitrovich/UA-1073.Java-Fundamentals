package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment {

    String federalTaxId;
    double hourRate;
    int hourWork;

    public ContractEmployee(String employeeId, String federalTaxId, double hourRate, int hourWork) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourRate = hourRate;
        this.hourWork = hourWork;
    }

    @Override
    public double calculatePay() {
        return hourRate * hourWork;
    }

    @Override
    String getEmployeeInfo() {
        return "Employee ID " + employeeId + ", Federal Tax Id: " + federalTaxId;
    }


}
