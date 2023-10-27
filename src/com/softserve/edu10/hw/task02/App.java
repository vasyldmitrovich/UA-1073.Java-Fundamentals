package com.softserve.edu10.hw.task02;

import javax.sound.midi.Soundbank;
import java.util.*;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        populatePersonMap(personMap);
        printPersonMap(personMap);
        printSameFirstName(personMap);
        deleteFirstName(personMap);
        printPersonMap(personMap);
    }

    public static void populatePersonMap(Map<String, String> personMap) {
        personMap.put("Koval", "Vadym");
        personMap.put("Tokar", "Petro");
        personMap.put("Slusarenko", "Vadym");
        personMap.put("Kozak", "Dmytro");
        personMap.put("Bereza", "Oleksandr");
        personMap.put("Stanko", "Orest");
        personMap.put("Isaenko", "Dmytro");
        personMap.put("Malar", "Ivanna");
        personMap.put("Buzko", "Olena");
        personMap.put("Bondar", "Vadym");
    }

    public static void printPersonMap(Map<String, String> personMap) {
        for (var e : personMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void printSameFirstName(Map<String, String> personMap) {
        Set<String> firstNames =  new HashSet<>(personMap.values());
        boolean isSameFirstNames = false;
        for (String firstName : firstNames) {
            int firstNameQuantity = Collections.frequency(personMap.values(), firstName);
            if (firstNameQuantity >= 2) {
                System.out.println("First name " + firstName + " has " + firstNameQuantity + " persons");
                isSameFirstNames = true;
            }
        }
        if (!isSameFirstNames) {
            System.out.println("There are no persons with the same first name");
        }
    }

    public static void deleteFirstName(Map<String, String> personMap) {
        System.out.print("Enter first name to delete: ");
        String firstName = SCANNER.nextLine();
        personMap.values().remove(firstName);
    }
}
