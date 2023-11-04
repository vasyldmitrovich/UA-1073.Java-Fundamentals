package com.softserve.edu10.hw;

import java.util.*;

class SecondHW {

    static void fillMap(Map<String, String> map) {
        map.put("One", "Second");
        map.put("Two", "Third");
        map.put("Tree", "Fourth");
        map.put("Four", "Fifth");
        map.put("Five", "Second");
        map.put("Six", "ddyjfuku");
        map.put("Seven", "Second");
        map.put("Eight", "Fourth");
        map.put("Nine", "Thirghjjhd");
        map.put("Ten", "Third");
    }

    static void frequencyByValue(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        int frequency;
        for (var entry : set) {
            frequency = Collections.frequency(map.values(), entry);
            if (frequency >= 2) {
                System.out.println("Value - '" + entry + "' occurs in our map " + frequency + " times");
            }
        }
    }

    static void removeByFirstName(Map<String, String> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person's first name, then i delete persons with this name from our map:");
        String toDelete = scanner.nextLine();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(toDelete)){
                iterator.remove();
            }
        }
    }

    static void printMap(Map<String, String> personMap) {
        System.out.println("-".repeat(30));
        for (Map.Entry<String, String> entry: personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
