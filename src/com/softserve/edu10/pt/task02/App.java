package com.softserve.edu10.pt.task02;


import java.util.*;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        populateEmployee(employeeMap, 7);
        printEmployee(employeeMap);
        System.out.print("Find employee. ");
        printEmployee(employeeMap, promptId());
        System.out.print("Find employee. ");
        printEmployee(employeeMap, promptName());
        System.out.print("Edit employee. ");
        editEmployee(employeeMap, promptId());
        printEmployee(employeeMap);
        String fieldToSort = promptFieldToSort();
        while (!fieldToSort.equals("exit")) {
            printEmployeeSorted(employeeMap, fieldToSort);
            fieldToSort = promptFieldToSort();
        }
    }

    public static void populateEmployee(Map<Integer, Employee> employeeMap, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("Enter employee name: ");
            Employee employee = new Employee(SCANNER.nextLine());
            if (employeeMap.containsValue(employee)) {
                System.out.println("The employee with name " + employee.getName() + " already exists. Please enter another one.");
                i--;
            } else {
                System.out.print("Enter employee position: ");
                employee.setPosition(SCANNER.nextLine());
                System.out.print("Enter employee salary: ");
                employee.setSalary(SCANNER.nextDouble());
                SCANNER.nextLine();
                System.out.print("Enter employee date of birth: ");
                employee.setDateOfBirth(SCANNER.nextLine());
                int id;
                do {
                    id = new Random().nextInt(900) + 100;
                } while (employeeMap.containsKey(id));
                employeeMap.put(id, employee);
                System.out.println("Employee added successfully!");
            }
        }
    }

    public static void printEmployee(Map<Integer, Employee> employeeMap) {
        for (var e : employeeMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void printEmployee(Map<Integer, Employee> employeeMap, int id) {
        if (employeeMap.containsKey(id)) {
            System.out.println(id + ": " + employeeMap.get(id));
        } else {
            System.out.println("Employee with ID " + id + " not found!");
        }
    }

    public static void printEmployee(Map<Integer, Employee> employeeMap, String name) {
        if (employeeMap.containsValue(new Employee(name))) {
            for (var e : employeeMap.entrySet()) {
                if (e.getValue().getName().equals(name)) {
                    System.out.println(e.getKey() + ": " + name);
                }
            }
        } else {
            System.out.println("Employee with name " + name + " not found!");
        }
    }

    public static int promptId() {
        System.out.print("Enter employee ID: ");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();
        return id;
    }

    public static String promptName() {
        System.out.print("Enter employee name: ");
        return SCANNER.nextLine();
    }

    public static String promptFieldToSort() {
        while (true) {
            System.out.print("Enter employee field `id`, `name` or `position` to sort or `exit` to exit: ");
            String field = SCANNER.nextLine().toLowerCase();
            if (field.equals("id") || field.equals("name") || field.equals("position") || field.equals("exit")) {
                return field;
            } else {
                System.out.println("The field " + field + " is incorrect. Please enter correct value!");
            }
        }
    }

    public static void editEmployee(Map<Integer, Employee> employeeMap, int id) {
        if (employeeMap.containsKey(id)) {
            while (true) {
                System.out.print("Enter employee name: ");
                Employee employee = new Employee(SCANNER.nextLine());
                if (!employeeMap.get(id).getName().equals(employee.getName()) && employeeMap.containsValue(employee)) {
                    System.out.println("The employee with name " + employee.getName() + " already exists. Please enter another name.");
                    continue;
                } else {
                    System.out.print("Enter employee position: ");
                    employee.setPosition(SCANNER.nextLine());
                    System.out.print("Enter employee salary: ");
                    employee.setSalary(SCANNER.nextDouble());
                    SCANNER.nextLine();
                    System.out.print("Enter employee date of birth: ");
                    employee.setDateOfBirth(SCANNER.nextLine());
                    employeeMap.put(id, employee);
                    System.out.println("Employee with ID " + id + " updated successfully!");
                }
                break;
            }
        } else {
            System.out.println("Employee with ID " + id + " not found!");
        }
    }

    public static void printEmployeeSorted(Map<Integer, Employee> employeeMap, String field) {
        var entries = new ArrayList<>(employeeMap.entrySet());
        switch (field) {
            case "id":
                entries.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                        return Integer.compare(o1.getKey(), o2.getKey());
                    }
                });
                break;
            case "name":
                entries.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                        return o1.getValue().getName().compareTo(o2.getValue().getName());
                    }
                });
                break;
            case "position":
                entries.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                        return o1.getValue().getPosition().compareTo(o2.getValue().getPosition());
                    }
                });
                break;
        }
        for (var entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
