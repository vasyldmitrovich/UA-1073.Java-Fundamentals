package com.softserve.edu10.pt.Task1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeedMap = new HashMap<>();

        for (int i = 1; i <= 7; i++) {
            employeedMap.put(2 * i, "A".repeat(i));

        }
        for (var e : employeedMap.entrySet()) {
            System.out.print("Key:" + e.getKey() + " value:" + e.getValue() + " || ");
        }
        System.out.println(" ");
        System.out.println(" ");


        var scan1 = new Scanner(System.in);
        System.out.println("Enter number Id:");
        int findNumber = scan1.nextInt();

        if (employeedMap.containsKey(findNumber)) {
            System.out.println("Employee with ID: " + findNumber + " is " + employeedMap.get(findNumber));
        } else {
            System.out.println("There is not employee with number: " + findNumber);
        }


        var scan2 = new Scanner(System.in);
        System.out.println("Enter value key:");
        String findValue = scan2.nextLine().toUpperCase(Locale.ROOT);
        System.out.println();

        if (employeedMap.containsValue(findValue)) {
            Integer index = null;
            for (var e : employeedMap.entrySet()) {
                if (e.getValue().equals(findValue)) {
                    index = e.getKey();
                    break;
                }
            }
            System.out.println("Employee with value: " + findValue + " is " + index);
        } else {
            System.out.println("There is not employee with value: " + findValue);
        }


    }
}