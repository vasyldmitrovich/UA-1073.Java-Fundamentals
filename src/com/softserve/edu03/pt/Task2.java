package com.softserve.edu03.pt;

import java.util.Locale;
public class Task2 {

    public static void main(String[] args) {//The same
        Locale.setDefault(Locale.ROOT);
        Employee employee1 = new Employee();
        Employee.promptValues(employee1);
        Employee employee2 = new Employee();
        Employee.promptValues(employee2);
        Employee employee3 = new Employee();
        Employee.promptValues(employee3);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println("Total salary is " + Employee.getTotalSum());
    }
}
