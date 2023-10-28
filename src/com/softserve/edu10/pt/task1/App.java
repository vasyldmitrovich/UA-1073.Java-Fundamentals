package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Andrii");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Petro");
        employeeMap.put(4, "Vasyl");
        employeeMap.put(5, "Luke");
        employeeMap.put(6, "Ivan");
        employeeMap.put(7, "Semen");

        printMap(employeeMap);

        System.out.print("Enter employee id: ");
        int idToFind = Integer.parseInt(scanner.nextLine());
        findEmployeeById(employeeMap, idToFind);
        System.out.print("Enter employee id: ");
        idToFind = Integer.parseInt(scanner.nextLine());
        findEmployeeById(employeeMap, idToFind);

        System.out.print("Enter employee name: ");
        String nameToFind = scanner.nextLine();
        findEmployeeByName(employeeMap, nameToFind);
        System.out.print("Enter employee name: ");
        nameToFind = scanner.nextLine();
        findEmployeeByName(employeeMap, nameToFind);

    }

    public static void findEmployeeById(Map<Integer, String> map, Integer key) {
        if (map.containsKey(key)) {
            System.out.printf("Employee with id %d is %s%n", key, map.get(key));
        } else {
            System.out.printf("Employee with id %d not found%n", key);
        }
    }

    public static void findEmployeeByName(Map<Integer, String> map, String value) {
        if (map.containsValue(value)) {
            for (var item : map.entrySet()) {
                if (item.getValue().equals(value)) {
                    Integer id = item.getKey();
                    System.out.printf("Employee id with name %s is %d%n", value, id);
                }
            }
        } else {
            System.out.printf("Employee with name %s not found%n", value);
        }
    }

    public static void printMap(Map<Integer, String> map) {
        for (var item : map.entrySet()) {
            Integer id = item.getKey();
            String name = item.getValue();
            System.out.printf("Id: %d, Name: %s%n", id, name);
        }
        System.out.println();
    }
}
