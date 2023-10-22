package com.softserve.edu10.hw;

import java.util.*;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        Map<String, String> personMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            addPerson(personMap);
        }

        printMap(personMap);

        boolean containsDuplicates = containsFirstNameDuplicates(personMap);

        if (containsDuplicates) {
            System.out.println("Contains first name duplicates");
        } else {
            System.out.println("Doesn't contain first name duplicates");
        }

        removeByName(personMap, "Orest");

        printMap(personMap);
    }

    public static void addPerson (Map<String, String> map) {
        System.out.println("Enter person first name");
        String firstName = SCANNER.nextLine();
        System.out.println("Enter person last name");
        String lastName = SCANNER.nextLine();
        map.putIfAbsent(lastName, firstName);
    }

    public static void printMap (Map<String, String> map) {
        System.out.println(map);
    }

    public static boolean containsFirstNameDuplicates (Map<String, String> map) {
        Set<String> duplicateNum = new HashSet<>(map.values());

        return duplicateNum.size() < map.size();
    }

    public static void removeByName (Map<String, String> map, String name) {
        for (var item : map.entrySet()) {
            if (Objects.equals(item.getValue(), name)) {
                map.remove(item.getKey());
            }
        }
    }
}
