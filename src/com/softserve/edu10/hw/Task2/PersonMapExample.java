package com.softserve.edu10.hw.Task2;

import java.util.HashMap;
import java.util.Map;

public class PersonMapExample {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        // Populate the map with entries
        personMap.put("Shpak", "Zoreslava");
        personMap.put("Gogol", "Bohdan");
        personMap.put("Zubyk", "Dmytro");
        personMap.put("Sokalskiy", "Rostyslav");
        personMap.put("Pyvovarov", "Maksym");
        personMap.put("Sydorenko", "Orest");
        personMap.put("Zelenskiy", "Volodymyr");
        personMap.put("Shevchenko", "Michael");

        System.out.println("Initial personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = MapOperations.hasDuplicateFirstName(personMap, "Orest");
        System.out.println("\nAt least two persons with the same first name 'Orest' : " + hasDuplicateFirstName);

        MapOperations.removePersonWithFirstName(personMap, "Orest");

        System.out.println("\npersonMap after removing 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
