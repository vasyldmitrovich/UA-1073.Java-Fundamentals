package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends PaidEmployee {
    private String socialSecurityNumber;
    private double hourlyRate;
    private double hoursWorked;

    public SalariedEmployee (String name, String employeeId, String socialSecurityNumber, double hourlyRate, double hoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate () {
        return hourlyRate;
    }

    public void setHourlyRate (double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked () {
        return hoursWorked;
    }

    public void setHoursWorked (double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getSocialSecurityNumber () {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber (String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay () {
        return hourlyRate * hoursWorked;
    }
}