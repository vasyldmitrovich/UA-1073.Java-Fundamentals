package edu10.hw.Task2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Symonenko", "Andriy");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Prosto", "Orest");
        personMap.put("Ukrainka", "Lesia");
        personMap.put("Vovchok", "Marko");
        personMap.put("Kostenko", "Lina");
        personMap.put("Neprosto", "Orest");
        personMap.put("Franko", "Ivan");
        personMap.put("Sosura", "Vasyl");
        personMap.put("Shvachko", "Khrystyna");

        System.out.println(personMap);

        boolean hasDuplicateName = duplicateName(personMap, "Orest");

        removePerson(personMap, "Orest");

        System.out.println(personMap);

    }


    public static boolean duplicateName(Map<String, String> map, String firstName) {
        int count = 0;
        for (String name : map.values()) {
            if (name.equals(firstName)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void removePerson (Map<String, String> map, String firstName) {
        map.values().removeIf(value -> value.equals(firstName));
    }
}
