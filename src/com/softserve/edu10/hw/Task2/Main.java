package com.softserve.edu10.hw.Task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("1", "Orest");
        personMap.put("2", "Bob");
        personMap.put("3", "Alice");
        personMap.put("4", "Anna");
        personMap.put("5", "Mike");
        personMap.put("6", "Mark");
        personMap.put("7", "Alex");
        personMap.put("8", "Alexs");
        personMap.put("9", "Mia");
        personMap.put("10", "Sam");
        System.out.println(personMap);
       if (personMap.containsValue("Orest")) {
           String key = null;
           for (var ent: personMap.entrySet()) {
               if (ent.getValue().equals("Orest")) {
                   key = ent.getKey();
                   break;
               }
           }
           personMap.remove(key, "Orest");
       }
        System.out.println(personMap);
        Set<String> set1 = new HashSet<>(personMap.values());
        if (set1.size() < personMap.size()) {
            System.out.println("have duplicate");
        } else {
            System.out.println("no duplicate was found");
        }
    }
    }
