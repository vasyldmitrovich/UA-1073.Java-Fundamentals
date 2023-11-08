package com.softserve.edu07.hw;

interface Payment {
    void pay();
}
abstract class Employee implements Payment {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}


class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double monthlySalary;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double monthlySalary) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void pay() {
        System.out.println("Salaried Employee: " + employeeId + ", Monthly Salary: " + monthlySalary);
    }
}


class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void pay() {
        double averageMonthlySalary = hourlyRate * hoursWorked;
        System.out.println("Contract Employee: " + employeeId + ", Monthly Salary: " + averageMonthlySalary);
    }
}

    public class Main {
        public static void main() {
            Employee[] employees = new Employee[3];

            employees[0] = new SalariedEmployee("1", "123-45-6789", 5000);
            employees[1] = new ContractEmployee("2", "987-65-4321", 20, 120);
            employees[2] = new ContractEmployee("3", "123-22-332", 20, 100);


            for (Employee employee : employees) {
                employee.pay();
            }
        }

    }