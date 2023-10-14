package com.softserve.edu07.hw.task1;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Contract JavaDev 1", 20000,"12345"),
                new ContractEmployee("Contract JavaDev 2", 31000,"34637"),
                new ContractEmployee("Contract JavaDev 3", 280000,"85653"),
                new SalariedEmployee("Salaried JavaDev 1", 1000,30,"2"),
                new SalariedEmployee("Salaried JavaDev 2", 700,25,"1"),
                new SalariedEmployee("Salaried JavaDev 3", 850,40,"5")
        };
        System.out.println("Before sort");
        for (var employe: employees) {
            System.out.println("------------------------------------");
            System.out.println(employe.getEmployeeld());
            employe.calculatePay();
            if (employe instanceof SalariedEmployee) {
                SalariedEmployee salariedEmployee = (SalariedEmployee) employe;
                System.out.println("Social Security Number: " + salariedEmployee.getSocialSecurityNumber());
            }
            if (employe instanceof ContractEmployee) {
                ContractEmployee contractEmployee = (ContractEmployee) employe;
                System.out.println("Federal Tax ID: " + contractEmployee.getFederalTaxId());
            }
        }
        System.out.println("------------------------------------");
        System.out.println("After sort");
        Comparator<Employee> salaryComparator = (e1, e2) -> Integer.compare(e2.getPayment(), e1.getPayment());
        Arrays.sort(employees, salaryComparator);
        for (Employee employe : employees) {
            System.out.println("------------------------------------");
            System.out.println("Employee ID: " + employe.getEmployeeld());
            System.out.println("Average Monthly Wage: " + employe.getPayment());
        }
    }
}
