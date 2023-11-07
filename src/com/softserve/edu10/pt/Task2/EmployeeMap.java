package com.softserve.edu10.pt.Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    static Scanner SCANNER = new Scanner(System.in);
    static Map<Integer, String[]> map1 = new HashMap<>();
    public static void getMap1(){
        for (int i = 0; i < map1.size(); i++) {
            System.out.print("ID: " + key);
            System.out.println(" Info: " + Arrays.toString(values));
        }
    }
     static int key = 0;
    static String[] values = null;
    public static void checkIDOrNameRepeat() {

        for (int i = 0; i < 2; i++) {
            key = getKey();
            values = getValues();
            if (map1.containsKey(key)) {
                System.out.println("already has this ID!");
                break;
            } else if (map1.containsValue(values[0])) {
                System.out.println("already has this name!");
                break;
            } else {
                    map1.put(key, values);
            }

        }
    }

    static int getKey() {
        System.out.println("add an ID");
        int key = SCANNER.nextInt();
        SCANNER.nextLine();
        return key;
    }

    static String[] getValues() {
        System.out.println("add a name");
        String name = SCANNER.nextLine();
        System.out.println("add a position");
        String position = SCANNER.nextLine();
        System.out.println("add a salary");
        String salary = SCANNER.nextLine();
        System.out.println("add a date of birth");
        String dateOfBirth = SCANNER.nextLine();
        String[] arrey = {name, position, salary, dateOfBirth};
        return arrey;
    }



}
