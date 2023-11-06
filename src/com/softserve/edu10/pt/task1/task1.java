package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<>();
        for (int i = 1; i < 8; i++) {
            employeeMap.put(2 * i,"A".repeat(i));
        }
        for (var e : employeeMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        var scanner = new Scanner(System.in);
        int idToFind = scanner.nextInt();
        if (employeeMap.containsKey(idToFind)){
            System.out.println("Employee with id: " + idToFind + " is " + employeeMap.get(idToFind));
        }else {
            System.out.println("Map dont contain this employee");
        }

        String nameToFind = scanner.next();

        if (employeeMap.containsValue(nameToFind)){
            Integer ix = null;
            for (var e : employeeMap.entrySet()){
                if (e.getValue().equals(nameToFind)){
                    ix = e.getKey();
                    break;
                }
            }
            System.out.println("Employee with name: " + nameToFind + " is " + ix);
        }else {
            System.out.println("Map dont contain this employee");
        }
    }
}
