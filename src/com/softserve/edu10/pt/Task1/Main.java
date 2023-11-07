package com.softserve.edu10.pt.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        for (int i = 1; i <= 7; i++) {
        employeeMap.put(2*i, "a".repeat(i));
        }
        for (var entry:employeeMap.entrySet() ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("input ID");
        int idToFind = scanner.nextInt();
        scanner.nextLine();

        if(employeeMap.containsKey(idToFind)) {

            System.out.println("Employee with ID " + idToFind + " is " + employeeMap.get(idToFind)) ;
        } else {
            System.out.println("Not found");
        }
        System.out.println("Input name");
        String nameToFind = scanner.nextLine();
        if (employeeMap.containsValue(nameToFind)) {
            Integer key = null;
            for (var ent: employeeMap.entrySet()) {
                if (ent.getValue().equals(nameToFind)) {
                    key = ent.getKey();
                    break;
                }
            }
            System.out.println("Employee with name " + nameToFind + " has ID " + key);
        } else {
            System.out.println("Not found");
        }
    }
}
