package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee implements Payment {

    String socSecurNum;
    double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socSecurNum, double fixedMonthlyPayment) {
        super(employeeId);
        this.socSecurNum = socSecurNum;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    String getEmployeeInfo() {
        return "Employee ID: " + employeeId + ", Social Security Number:  " + socSecurNum;
    }


}
