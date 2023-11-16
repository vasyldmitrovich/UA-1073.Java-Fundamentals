package com.softserve.edu10.hw.Task2;

import java.util.HashMap;
import java.util.Map;

public class PersonMapExample {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Marta", "Anna");
        personMap.put("Olena", "Olya");
        personMap.put("Rost", "Ostap");
        personMap.put("Vasyl", "Dima");
        personMap.put("Denys", "Orest");
        personMap.put("Illya", "Orest");  // Duplicate first name
        personMap.put("Sasha", "Emily");
        personMap.put("Anderson", "Oscar");
        personMap.put("Vika", "Orest");   // Duplicate first name
        personMap.put("Bodya", "Syava");

        System.out.println("Original personMap:");
        displayPersonMap(personMap);

        boolean hasDuplicateFirstName = checkForDuplicateFirstName(personMap);
        System.out.println("Are there at least two persons with the same first name? " + hasDuplicateFirstName);

        removePersonByFirstName(personMap, "Orest");

        System.out.println("PersonMap after removing persons with the first name 'Orest':");
        displayPersonMap(personMap);
    }

    private static void displayPersonMap(Map<String, String> personMap) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    private static boolean checkForDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        for (int count : firstNameCount.values()) {
            if (count > 1) {
                return true;
            }
        }

        return false;
    }

    private static void removePersonByFirstName(Map<String, String> personMap, String firstNameToRemove) {
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(firstNameToRemove));
    }
}

