package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Мельник", "Іван");
        personMap.put("Шевченко", "Олексій");
        personMap.put("Пастерук", "Сидор");
        personMap.put("Журба", "Олег");
        personMap.put("Гоффман", "Хуго");
        personMap.put("Щур", "Богдан");
        personMap.put("Жук", "Михайло");
        personMap.put("Гордій", "Андрій");
        personMap.put("Сміт", "Боб");

        printMap(personMap);
    }

    private static void printMap(Map<String, String> personMap) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", ім'я: " + entry.getValue());
        }
    }
}