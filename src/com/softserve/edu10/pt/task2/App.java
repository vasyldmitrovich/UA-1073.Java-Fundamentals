package com.softserve.edu10.pt.task2;

import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        inputMap(employeeMap);
        printMap(employeeMap);

        System.out.print("Enter employee id: ");
        int idToFind = Integer.parseInt(scanner.nextLine());
        findEmployeeById(employeeMap, idToFind);
        System.out.print("Enter employee id: ");
        idToFind = Integer.parseInt(scanner.nextLine());
        findEmployeeById(employeeMap, idToFind);

        System.out.print("Enter employee name: ");
        String nameToFind = scanner.nextLine();
        findEmployeeByName(employeeMap, nameToFind);
        System.out.print("Enter employee name: ");
        nameToFind = scanner.nextLine();
        findEmployeeByName(employeeMap, nameToFind);

        System.out.print("Enter employee id, which you want edit: ");
        int editId = Integer.parseInt(scanner.nextLine());
        editEmployeeById(employeeMap, editId);
        System.out.println("Updated map:");
        printMap(employeeMap);

        printMap(getSortedMap(employeeMap));

        printMap(getSortedMap(employeeMap));

        printMap(getSortedMap(employeeMap));


    }

    public static Map<Integer, Employee> getSortedMap(Map<Integer, Employee> map) {
        Map<Integer, Employee> result = new LinkedHashMap<>();
        var sortedMap = new ArrayList<>(map.entrySet());
        while (true) {
            System.out.println("Which type to sorting are you want to choose:");
            System.out.println("1. By ID");
            System.out.println("2. By name");
            System.out.println("3. By position");
            int choose = Integer.parseInt(scanner.nextLine());
            boolean sorted = false;
            switch (choose) {
                case 1:
                    Collections.sort(sortedMap, new Comparator<Map.Entry<Integer, Employee>>() {
                        @Override
                        public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    });
                    sorted = true;
                    break;
                case 2:
                    Collections.sort(sortedMap, new Comparator<Map.Entry<Integer, Employee>>() {
                        @Override
                        public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                            return o1.getValue().getName().compareTo(o2.getValue().getName());
                        }
                    });
                    sorted = true;
                    break;
                case 3:
                    Collections.sort(sortedMap, new Comparator<Map.Entry<Integer, Employee>>() {
                        @Override
                        public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                            Employee employee1 = o1.getValue();
                            Employee employee2 = o2.getValue();

                            if (employee1.getPosition() == null && employee2.getPosition() == null) {
                                return 0;
                            } else if (employee1.getPosition() == null) {
                                return 1;
                            } else if (employee2.getPosition() == null) {
                                return -1;
                            } else {
                                return employee1.getPosition().compareTo(employee2.getPosition());
                            }
                        }
                    });
                    sorted = true;
                    break;
                default:
                    System.out.println("Wrong number! Try again.");
            }
            if (sorted) {
                break;
            }
        }
        for (var item : sortedMap) {
            result.put(item.getKey(), item.getValue());
        }
        return result;
    }

    public static void editEmployeeById(Map<Integer, Employee> map, Integer key) {
        if (!map.containsKey(key)) {
            System.out.printf("Employee with id %d doesn`t exist.%n", key);
            return;
        }
        while (true) {
            System.out.println("1. Edit salary");
            System.out.println("2. Edit position");
            System.out.println("9. Exit editing");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Input updated employee`s salary: ");
                    int salary = Integer.parseInt(scanner.nextLine());
                    map.get(key).setSalary(salary);
                    break;
                case 2:
                    System.out.print("Input updated employee`s position: ");
                    String position = scanner.nextLine();
                    map.get(key).setPosition(position);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Wrong number! Try again.");
            }

        }


    }

    public static void findEmployeeById(Map<Integer, Employee> map, Integer key) {
        if (map.containsKey(key)) {
            System.out.printf("Employee with id %d is %s%n", key, map.get(key));
        } else {
            System.out.printf("Employee with id %d not found%n", key);
        }
    }

    public static void findEmployeeByName(Map<Integer, Employee> map, String value) {
        if (map.containsValue(new Employee(value))) {
            for (var item : map.entrySet()) {
                if (item.getValue().equals(new Employee(value))) {
                    Integer id = item.getKey();
                    System.out.printf("Employee id with name %s is %d%n", value, id);
                }
            }
        } else {
            System.out.printf("Employee with name %s not found%n", value);
        }
    }

    public static void printMap(Map<Integer, Employee> map) {
        for (var item : map.entrySet()) {
            Integer id = item.getKey();
            Employee employee = item.getValue();
            System.out.printf("Id: %d, Name: %s%n", id, employee);
        }
        System.out.println();
    }

    public static void inputMap(Map<Integer, Employee> map) {
        while (true) {
            System.out.print("Input employee`s id: ");
            Integer id = Integer.parseInt(scanner.nextLine());
            System.out.print("Input employee`s name: ");
            String name = scanner.nextLine();
            if (!isDuplicate(map, id, name)) {
                System.out.println("Would you like to input additional information? (Y/N)");
                String answer = scanner.nextLine().toLowerCase();
                if (answer.equals("y")) {
                    System.out.print("Input employee`s salary: ");
                    int salary = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input employee`s position: ");
                    String position = scanner.nextLine();
                    System.out.print("Input employee`s date of birth(DD, MM, YYYY): ");
                    String[] date = scanner.nextLine().split("\\s");
                    int day = Integer.parseInt(date[0]);
                    int month = Integer.parseInt(date[1]) - 1;
                    int year = Integer.parseInt(date[2]);
                    map.put(id, new Employee(name, position, salary, new GregorianCalendar(year, month, day)));
                } else {
                    map.put(id, new Employee(name));
                }
            } else {
                System.out.println("Duplicate detected. Input data has been stopped.\n");
                break;
            }
        }
    }

    public static boolean isDuplicate(Map<Integer, Employee> map, Integer key, String value) {
        return map.containsKey(key) && map.containsValue(new Employee(value));
    }

}
