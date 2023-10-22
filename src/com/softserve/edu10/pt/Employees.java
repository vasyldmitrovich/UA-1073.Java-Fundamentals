package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employees {
    static final Scanner SCANNER = new Scanner(System.in);
    private static int employeeCount;
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public static void createEmployee (Employees list) {
        employeeCount++;
        System.out.println("Enter employee name");
        String name = SCANNER.nextLine();
        System.out.println("Enter employee position");
        String position = SCANNER.nextLine();
        System.out.println("Enter employee salary");
        int salary = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Enter employee date of birth");
        String dateOfBirth = SCANNER.nextLine();

        Employee employee = new Employee(employeeCount, name, position, salary, dateOfBirth);

        list.addEmployee(employee);
    }

    public void addEmployee (Employee employee) {
        var result = employeeMap.putIfAbsent(employeeCount, employee);

        if (result == null) {
            System.out.println("There is already employee with such an id");
        }
    }

    public void findByKey (int key) {
        if (!employeeMap.containsKey(key)) {
            System.out.println("There is no such key");
            return;
        }

        System.out.println("Employee's name is: " + employeeMap.get(key));
    }


    public void findByValue (String name) {
        if (!employeeMap.containsValue(name)) {
            System.out.println("There is no such employee of name " + name);
            return;
        }

        int id = 0;

        for (var item : employeeMap.entrySet()) {
            if (item.getValue().hasEqualNames(name)) {
                id = item.getKey();
                break;
            }
        }

        System.out.println("Employee's id is: " + id);
    }

    public void print () {
        for (var item : employeeMap.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }

}
