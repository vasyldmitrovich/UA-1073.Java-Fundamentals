package com.softserve.edu10.pt;

import java.util.*;

class EmployeeMapTask1 {

    private static TreeSet<Integer> findKey(Map<Integer, String> employeeMap, String value) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value)){
                set.add(entry.getKey());
            }
        }
        return set;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "George");
        employeeMap.put(2, "John");
        employeeMap.put(3, "Thomas");
        employeeMap.put(4, "James");
        employeeMap.put(5, "James");
        employeeMap.put(6, "John");
        employeeMap.put(7, "Andrew");

        System.out.println(employeeMap);


        System.out.println("Hello, please input ID of the employee (from 1 to 7):");
        int k = sc.nextInt();
        System.out.println(employeeMap.containsKey(k) ?
                ("employee with id " + k + " is " + employeeMap.get(k)):
                "This map does not contain input key");
        // Idea recommend replace upper line of code, so I try...
//        System.out.println(employeeMap.getOrDefault(k, "This map does not contain input key"));


        System.out.println("Now input name of the employee:");
        sc.nextLine();
        String value = sc.nextLine();
        value = Character.toUpperCase(value.charAt(0)) + value.substring(1);

        if(employeeMap.containsValue(value)) {
            System.out.println("This map contains \"" + value + "\" with id - " + findKey(employeeMap, value));
        } else {
            System.out.println("This map does not contain " + value);
        }
    }
}
