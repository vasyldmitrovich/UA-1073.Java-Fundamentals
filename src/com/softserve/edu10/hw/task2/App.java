package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap<>();
        personMap.put("Babenok","Anton");
        personMap.put("Konoval","Marya");
        personMap.put("Zinnik","Oleksiy");
        personMap.put("Krasyckiy","Andryi");
        personMap.put("Radashov","Bogdan");
        personMap.put("Romanchuk","Dima");
        personMap.put("Bodnya","Andryi");
        personMap.put("Vlasyk","Vladimir");
        personMap.put("Korzh","Dalylo");
        personMap.put("Mamedov","Musa");

        System.out.println(personMap.size());

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
            String name1 = entry1.getValue();

            for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
                String name2 = entry2.getValue();

                if (!entry1.equals(entry2) && name1.equals(name2)) {
                    System.out.println("Ім'я " + name1 + " повторюється.");
                }
            }
        }
        String nameToRemove = "Musa";
        personMap.values().removeIf(name -> name.equals(nameToRemove));

        for (Map.Entry<String,String> entry : personMap.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }
}
