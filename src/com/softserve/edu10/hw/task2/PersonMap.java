package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();


        personMap.put("Khmilyovskyy", "Oleh");
        personMap.put("Hudyma", "Maryan");
        personMap.put("Kozak", "Orest");
        personMap.put("Hluhenkyy", "Dima");
        personMap.put("Mydlyak", "Illya");
        personMap.put("Lazurko", "Max");
        personMap.put("Skaskiv", "Yulia");
        personMap.put("Bondarenko", "Maria");
        personMap.put("Muzyka", "Orest");
        personMap.put("Kravchuk", "Sophia");


        System.out.println("Contents of the map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        boolean hasDuplicateFirstName = hasDuplicateFirstName(personMap);

        if (hasDuplicateFirstName) {
            System.out.println("At least two persons have the same first name.");
        } else {
            System.out.println("No two persons have the same first name.");
        }


        removePersonWithFirstName(personMap, "Orest");


        System.out.println("\nMap after removing persons with the first name 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static boolean hasDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);

            if (firstNameCount.get(firstName) >= 2) {
                return true;
            }
        }

        return false;
    }

    public static void removePersonWithFirstName(Map<String, String> personMap, String firstName) {
        personMap.values().removeIf(name -> name.equals(firstName));
    }
}
