package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = createMap();
        printMap(employeeMap);
        searchById(employeeMap);
        searchByName(employeeMap);
    }

    private static Map<Integer, String> createMap(){
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Ivan");
        employeeMap.put(3, "Tom");
        employeeMap.put(5, "Emma");
        employeeMap.put(20, "Anna");
        employeeMap.put(7, "Vasya");
        employeeMap.put(6, "Dima");
        employeeMap.put(55, "Ivan");

        return employeeMap;
    }

    private static void printMap(Map<Integer, String> employeeMap){
        for(var employee : employeeMap.entrySet()){
            System.out.printf("Id: %d, Name: %s%n", employee.getKey(), employee.getValue());
        }
        System.out.println();
    }

    private static void searchById(Map<Integer, String> employeeMap){
        while (true){
            int id = readLineAndConvertToNumber("Enter id to display the name of the corresponding employee: ", Integer.class);

            if(employeeMap.containsKey(id)){
                System.out.printf("By the specified id, the employee's name: %s.%n%n", employeeMap.get(id));
                return;
            }

            System.out.println("There is no employee at the specified id.");
        }
    }

    private static <T extends Number> T readLineAndConvertToNumber(String prompt, Class<T> numberClass) {
        T enteredNum = null;

        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine();

            try {
                if (numberClass == Integer.class) {
                    enteredNum = numberClass.cast(Integer.parseInt(input));
                } else if (numberClass == Double.class) {
                    enteredNum = numberClass.cast(Double.parseDouble(input));
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return enteredNum;
    }

    private static void searchByName(Map<Integer, String> employeeMap){
        while (true){
            System.out.print("Enter the employee's name: ");
            String name = SCANNER.nextLine();

            if(employeeMap.containsValue(name)){
                printFoundEmployees(employeeMap, name);
                return;
            }

            System.out.println("There is no employee at the specified id.");
        }
    }

    private static void printFoundEmployees(Map<Integer, String> employeeMap, String name){
        for (var employee : employeeMap.entrySet()){
            if(employee.getValue().equals(name)){
                System.out.printf("By the specified name - employee id: %d.%n", employee.getKey());
            }
        }
        System.out.println();
    }
}
