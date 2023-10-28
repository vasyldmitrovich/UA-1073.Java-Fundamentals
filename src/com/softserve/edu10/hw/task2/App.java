package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Berchak", "Andrii");
        personMap.put("Ivanshyn", "Oleg");
        personMap.put("Gush", "Vasyl");
        personMap.put("Kuziuk", "Nadiia");
        personMap.put("Lesiuk", "Orest");
        personMap.put("Zaharchuk", "Oleg");
        personMap.put("Bender", "Ostap");
        personMap.put("Dovbush", "Andrii");
        personMap.put("Pedan", "Oleksandr");
        personMap.put("Jobs", "Andrii");

        checkSameName(personMap);

        System.out.println("Map before deleting:");
        System.out.println(personMap);
        deletePersonByName(personMap, "Orest");
        System.out.println("Map after deleting:");
        System.out.println(personMap);
    }

    public static void checkSameName(Map<String, String> map) {
        Map<String, Integer> counter = new HashMap<>();
        for (var item : map.entrySet()) {
            if (counter.containsKey(item.getValue())) {
                counter.put(item.getValue(), counter.get(item.getValue()) + 1);
            } else {
                counter.put(item.getValue(), 1);
            }
        }

        for (var item : counter.entrySet()) {
            if (item.getValue() >= 2) {
                System.out.printf("Name %s appears %d times in the map%n", item.getKey(), item.getValue());
            }
        }
    }

    public static void deletePersonByName(Map<String, String> map, String value) {
        String key = null;
        for (var item : map.entrySet()) {
            if (item.getValue().equals(value)) {
                key = item.getKey();
                break;
            }
        }
        if (key != null) {
            map.remove(key);
            System.out.printf("Person with name %s was successfully deleted%n", value);
        } else {
            System.out.printf("Person with name %s doesn`t exist%n", value);
        }
    }
}
