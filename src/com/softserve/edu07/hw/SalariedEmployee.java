package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double salary, String socialSecurityNumber) {
        super(employeeId, name, salary);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString() +
                "socialSecurityNumber=" + socialSecurityNumber +
                "}";
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
