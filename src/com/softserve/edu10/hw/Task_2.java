package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Markin", "Bob");
        personMap.put("Petrova", "Liz");
        personMap.put("Makson", "Maks");
        personMap.put("Markon", "Mark");
        personMap.put("Artemonov", "Artem");
        personMap.put("Ruslanov", "Ruslan");
        personMap.put("Nikov", "Nik");
        personMap.put("Lizov", "Liz");
        personMap.put("Petrov", "Petro");
        personMap.put("Bobkin", "Bobik");
        System.out.println(personMap);

        boolean duplicateFirstName = checkDuplicateFirstName(personMap);
        System.out.println("Are there at least two people with the same name? " + duplicateFirstName);

        removePersonByFirstName(personMap, "Petro");
        System.out.println(personMap);
    }

    private static boolean checkDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        return firstNameCount.values().stream().anyMatch(count -> count >= 2);
    }

    private static void removePersonByFirstName(Map<String, String> personMap, String firstNameToRemove) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstNameToRemove)) {
                iterator.remove();
                System.out.println("A person with a name '" + firstNameToRemove + "' deleted.");
                break;
            }
        }
    }
}