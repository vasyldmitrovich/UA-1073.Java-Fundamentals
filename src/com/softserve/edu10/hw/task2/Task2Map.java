package com.softserve.edu10.hw.task2;

import java.util.*;

public class Task2Map {
    public static void main(String[] args) {

        Map<String, String> mapPerson = new HashMap<>();

        mapPerson.put("Artur", "Din");
        mapPerson.put("Tom", "Orest");
        mapPerson.put("Ketti", "Perry");
        mapPerson.put("Tania", "Oman");
        mapPerson.put("Ivan", "Scale");
        mapPerson.put("Jack", "Orest");
        mapPerson.put("Denials", "Grav");
        mapPerson.put("Hermione", "Lexi");
        mapPerson.put("Ron", "Orest");
        mapPerson.put("Harry", "Din");

        System.out.println("List:");
        for (Map.Entry<String, String> entry : mapPerson.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        boolean hasDuplicateName = checkForDuplicateName(mapPerson);
        if (hasDuplicateName = true) {
            System.out.println("\nThere are duplicates in the list");
        } else {
            System.out.println("\nNo duplicates found");
        }

        removePersonByName(mapPerson, "Orest");

        System.out.println("\nList after deletion: ");
        for (Map.Entry<String, String> entry : mapPerson.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static boolean checkForDuplicateName(Map<String, String> map) {
        Set<String> nameSet = new HashSet<>(map.values());

        return nameSet.size() < map.size();

    }

    public static void removePersonByName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
            }
        }
    }

}

