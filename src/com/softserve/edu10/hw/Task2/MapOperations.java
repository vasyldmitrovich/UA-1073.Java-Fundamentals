package com.softserve.edu10.hw.Task2;


import java.util.Map;

public class MapOperations {
    // Check if there are at least two persons with the same first name
    public static boolean hasDuplicateFirstName(Map<String, String> map, String firstName) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(firstName)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    // Remove a person with a specified first name
    public static void removePersonWithFirstName(Map<String, String> map, String firstName) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(firstName));
    }
}



