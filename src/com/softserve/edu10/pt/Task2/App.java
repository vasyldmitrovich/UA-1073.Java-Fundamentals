package com.softserve.edu10.pt.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            if (containsName(employeeMap, name)) {
                System.out.println("Duplicate name, please enter another name.");
                continue;
            }

            System.out.println("Enter employee position:");
            String position = scanner.nextLine();

            System.out.println("Enter employee salary:");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter employee date of birth:");
            String dateOfBirth = scanner.nextLine();

            employeeMap.put(2 * i, new Employee(name, position, salary, dateOfBirth));
        }

        System.out.println("Employee information:");
        for (var entry : employeeMap.entrySet()) {
            int id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("ID: " + id);
            System.out.println("Name: " + employee.getName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Date of Birth: " + employee.getDateOfBirth());
            System.out.println();
        }
    }

    public static boolean containsName(Map<Integer, Employee> map, String name) {
        return map.values().stream().anyMatch(employee -> employee.getName().equals(name));
    }
}


