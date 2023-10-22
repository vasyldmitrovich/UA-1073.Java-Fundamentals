package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String removeName = "Jackson";
        Map<String, String> personMap = createMap();

        print(personMap);
        removePersonByName(personMap, removeName);
        print(personMap);
    }

    private static Map<String, String> createMap(){
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Collins", "Lucas");
        personMap.put("Bennett", "Olivia");
        personMap.put("Anderson", "Ethan");
        personMap.put("Taylor", "Ava");
        personMap.put("Parker", "Harper");
        personMap.put("Mitchell", "Chloe");
        personMap.put("Carter", "Jackson");
        personMap.put("Hayes", "Liam");
        personMap.put("Foster", "Aria");
        personMap.put("Sullivan", "Jackson");

        return personMap;
    }

    private static void removePersonByName(Map<String, String> personMap, String personName){
        System.out.printf("Removal from the list with the name %s.%n", personName);
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(personName));
        System.out.println();
    }

    private static void print(Map<String, String> personMap){
        System.out.println("Info persons");
        for(var person : personMap.entrySet()){
            System.out.printf("\tSurname: %s First name: %s.%n", person.getKey(), person.getValue());
        }
        System.out.println();
    }
}
