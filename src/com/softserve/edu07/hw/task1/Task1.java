package com.softserve.edu07.hw.task1;

import java.util.Arrays;

public class Task1 {
    public static void main (String[] args) {
        Employee[] employees = {
                new ContractEmployee("Employee 1" , "1","1", 1000),
                new SalariedEmployee("Employee 2" , "2","2", 25, 160),
        };
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
