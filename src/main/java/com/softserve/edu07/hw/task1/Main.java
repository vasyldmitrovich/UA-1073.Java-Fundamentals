package com.softserve.edu07.hw.task1;

import java.util.Arrays;

public class Main {//All good
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new ContractEmployee("1", "Jogn", "52122146", 5, 8),
                new SalariedEmployee("2", "Ivan", "7544441", 500.0),
                new SalariedEmployee("3", "Ilya", "4444444", 60.0),
                new ContractEmployee("4", "Bohdan", "532142", 9, 12)
        };

        printEmployeesInfo(employees);
    }

    private static void printEmployeesInfo(Employee[] employees){
        Arrays.sort(employees);

        System.out.println("Information about employees:");

        for(Employee employee : employees){
            System.out.printf("\t%s%n", employee);
        }
    }
}
