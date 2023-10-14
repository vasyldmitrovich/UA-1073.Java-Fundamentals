package com.softserve.edu07.hw.task01;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double hourlyRate;
    private double hoursWorked;

    public SalariedEmployee() {
        super();
        this.socialSecurityNumber = null;
        this.hourlyRate = 0;
        this.hoursWorked = 0;
    }

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double hourlyRate, double hoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "ID: " + getEmployeeId() + " Name: " + getName() + " SSN: " + getSocialSecurityNumber() +
                " Monthly: " + calculatePay();
    }
}
