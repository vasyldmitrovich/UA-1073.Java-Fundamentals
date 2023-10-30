package com.softserve.edu10.pt.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> eployeeMap = new HashMap<>();
        for (int i = 1; i <= 7; i++) {
            eployeeMap.put(2*i, "A".repeat(i));
        }
        for (var e : eployeeMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the ID of employee:");
        int idToFind = scanner.nextInt();
        scanner.nextLine();

        if (eployeeMap.containsKey(idToFind)) {
            System.out.println("Employee with ID " + idToFind + " is "
                    + eployeeMap.get(idToFind) + ".");
        } else {
            System.out.println("There is no employee with id " + idToFind + ".");
        }

        System.out.println("Please, enter the name of employee:");
        String nameToFind = scanner.nextLine();



        if (eployeeMap.containsValue(nameToFind)) {
            Integer ix = null;
            for (var e : eployeeMap.entrySet()) {
                if (e.getValue().equals(nameToFind)){
                    ix = e.getKey();
                    break;
                }
            }
            System.out.println("Employee with ID " + ix + " has the name "
                    + nameToFind + ".");
        } else {
            System.out.println("There is no employee with this name "
                    + nameToFind + ".");
        }

    }
}
