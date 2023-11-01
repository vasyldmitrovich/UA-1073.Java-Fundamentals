package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        for (int i = 0; i <= 7; i++) {
            employeeMap.put(2 * i, "A".repeat(i));
        }

        for (var e : employeeMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        int idToFind = 6;
        if (employeeMap.containsKey(idToFind)){
            System.out.println("Employee with id = " + idToFind + " is " + employeeMap.get(idToFind));
        } else {
            System.out.println("There is no employee with id = " + idToFind);
        }
        String nameToFind = "AAA";
        if (employeeMap.containsValue(nameToFind)){
            Integer ix = null;
            for (var e : employeeMap.entrySet()){
                if (e.getValue().equals(nameToFind)){
                    ix = e.getKey();
                    break;
                }
            }


            System.out.println("Employee with name = " + nameToFind + " is at id " + ix);
        } else {
            System.out.println("There is no employee with name = " + nameToFind);
        }
    }
}
