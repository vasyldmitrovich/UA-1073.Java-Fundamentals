package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(2134, "Bob Markin");
        employeeMap.put(2333, "Mark JT");
        employeeMap.put(5676, "Ann UV");
        for (var e : employeeMap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }


        System.out.println("Input ID number: ");
        int idToFind = Integer.parseInt(scanner.nextLine());
        if(employeeMap.containsKey(idToFind)){
            System.out.println("Employee with id = "
                    + idToFind + " is " + employeeMap.get(idToFind));
        } else {
            System.out.println("There is no employee with id = " + idToFind);
        }


        System.out.println("Input NAME id: ");
        String nameToFind = scanner.nextLine();



        if (employeeMap.containsValue(nameToFind)){
            Integer ix = null;
            for (var e : employeeMap.entrySet()){
                if (e.getValue().equals(nameToFind)){
                    ix = e.getKey();
                    break;
                }
            }

            System.out.println("Employee with name = " + nameToFind + " is " + ix);
        }else {
            System.out.println("There is no employee with name = " + nameToFind);
        }
    }
}