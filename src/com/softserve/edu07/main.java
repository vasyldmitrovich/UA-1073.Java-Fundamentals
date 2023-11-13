package com.softserve.edu07;

interface Payment {
    double calculatePay();
}

abstract class employee {
    String employeeId;

    public employee(String employeeId) {
        this.employeeId = employeeId;
    }
}

class SalariedEmployee extends employee implements Payment {
    String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return 5000.0;
    }
}

// ContractEmployee class
class ContractEmployee extends employee implements Payment {
    String federalTaxId;

    public ContractEmployee(String employeeId, String federalTaxId) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
    }

    @Override
    public double calculatePay() {
        return 20.0 * 40.0;
    }
}

// Main class for testing
public class main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("001", "123-45-6789");
        ContractEmployee contractEmployee = new ContractEmployee("002", "987-65-4321");

        System.out.println("Salaried Employee Pay: " + salariedEmployee.calculatePay());
        System.out.println("Contract Employee Pay: " + contractEmployee.calculatePay());
    }
}
