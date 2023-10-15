package com.softserve.edu07.task1;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int numberOfHours;


    public SalariedEmployee(String employeeId, String socialSecurityNumber, double hourlyRate, int numberOfHours) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHours;
    }

}
