package com.softserve.edu07.hw.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Salaried1111","Bob","Salaried1001",30000),
                new SalariedEmployee("Salaried2222","Alex","Salaried1002",500),
                new SalariedEmployee("Salaried3333","Mark","Salaried1003",100),
                new ContractEmployee("Contract1111", "Anna","Contract1001",100,20),
                new ContractEmployee("Contract2222", "Marta", "Contract1002",500,10),
                new ContractEmployee("Contract3333", "Sofia","Contract1003",70,5),
        };
        Arrays.sort(employees, new SortByAverageMonthlyWage());
        for (var em:employees) {
            System.out.println(em.toString());
        }

    }
}
