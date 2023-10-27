package com.softserve.edu10.pt.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        populateEmployee(employeeMap, 7);
        printEmployee(employeeMap);
        printEmployee(employeeMap, promptId());
        printEmployee(employeeMap, promptName());
    }

    public static void populateEmployee(Map<Integer, String> employeeMap, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("Enter employee name: ");
            String name = SCANNER.nextLine();
            employeeMap.put(employeeMap.size() + 1, name);
        }
    }

    public static void printEmployee(Map<Integer, String > employeeMap) {
        for (var e : employeeMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void printEmployee(Map<Integer, String > employeeMap, int id) {
        if (employeeMap.containsKey(id)) {
            System.out.println(id + ": " + employeeMap.get(id));
        } else {
            System.out.println("Employee with ID " + id + " did not found!");
        }
    }

    public static void printEmployee(Map<Integer, String > employeeMap, String name) {
        if (employeeMap.containsValue(name)) {
            for (var e : employeeMap.entrySet()) {
                if (e.getValue().equals(name)) {
                    System.out.println(e.getKey() + ": " + name);
                }
            }
        } else {
            System.out.println("Employee with name " + name + " not found!");
        }
    }

    public static int promptId() {
        System.out.print("Enter employee ID: ");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();
        return id;
    }

    public static String promptName() {
        System.out.print("Enter employee name: ");
        return SCANNER.nextLine();
    }
}
