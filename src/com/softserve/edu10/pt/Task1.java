package com.softserve.edu10.pt;

import java.util.Scanner;

public class Task1 {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        Employees employeeMap = new Employees();


        for (int i = 0; i < 7; i++) {
            Employees.createEmployee(employeeMap);
        }

        employeeMap.print();
        employeeMap.findByKey(askForKey());
        employeeMap.findByValue(askForValue());
    }


    public static int askForKey () {
        System.out.println("Enter key of employee");

        int key = SCANNER.nextInt();
        SCANNER.nextLine();

        return key;
    }

    public static String askForValue () {
        System.out.println("Enter name of employee");

        String name = SCANNER.nextLine();

        return name;
    }
}
