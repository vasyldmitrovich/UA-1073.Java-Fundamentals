package com.softserve.edu10.task2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Petrenko", "Oleksiy");
        personMap.put("Ivanenko", "Anna");
        personMap.put("Vasilenko", "Maria");
        personMap.put("Kovalenko", "Anna");
        personMap.put("Tkachenko", "Orest");
        personMap.put("Shevchuk", "Nataliya");
        personMap.put("Bondarenko", "Volodymyr");
        personMap.put("Kravchuk", "Lydia");
        personMap.put("Lysenko", "Tetyana");
        personMap.put("Hryhorenko", "Oleksiy");

        print(personMap);
        hasSameName(personMap);
        removeWithName(personMap, "Volodymyr");

        print(personMap);
    }
    public static void print(Map<String, String> personMap) {
        for (String p : personMap.keySet()) {
            System.out.println(personMap.get(p) + " " + p);
        }
    }
    public static void hasSameName(Map<String, String> personMap) {
        List<String> sameNames = new ArrayList<>();
        for (String name : personMap.values()) {
            if (Collections.frequency(personMap.values(), name) == 2 && !sameNames.contains(name)) {
                sameNames.add(name);
            }
        }
        for (String name : sameNames) {
            System.out.println("Found 2 person with name " + name);
        }
    }
    public static void removeWithName(Map<String, String> personMap, String name) {
        personMap.values().remove(name);
    }
}
