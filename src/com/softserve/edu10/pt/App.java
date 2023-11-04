package com.softserve.edu10.pt;

import java.util.*;

class App {


    public static void main(String[] args) {

        Map<Integer, Employee> map = new EmployeeMap<>();

        Employee emp1 = new Employee("Bob");
        Employee emp2 = new Employee("Jack", "trainee", 700, 18, 10, 1990);
        Employee emp3 = new Employee("George", "middle", 1000, 4, 6, 1984);
        map.put(1, emp1);
        map.put(2, emp2);
        map.put(3, emp3);

        denominatorLine();

        print(map);
        denominatorLine();

        System.out.println("try to put again emp2 but with ID #4 into collection. Method check if there's such value exist in collection and inform user");
        map.put(4, emp2);
        denominatorLine();

        System.out.println("clone (deep) value and try to add again, here i check fo contains by value");
        Employee emp4 = emp2.clone();
        map.put(4, emp4);
        denominatorLine();

        System.out.println("change clone Employee with ID - 4 (emp4) and try to add again (i change day of birth");
        emp4.setDay(13);
        emp4.setSalary(900);
        map.put(4, emp4);
        denominatorLine();

        print(map);
        denominatorLine();

        System.out.println("changing Employee inside our collection (there was no explaining how it should be, so I just use method replace())");
        map.replace(1, new Employee("Bob", "senior java developer", 2500, 12, 6, 1988));

        print(map);
        denominatorLine();

        sortBySalaryAscending(map);
        denominatorLine();

        sortBySalaryDescending(map);
        denominatorLine();

        sortByNameAscending(map);
        denominatorLine();

        sortByNameDescending(map);
        denominatorLine();

        System.out.println("checking our original map");
        print(map);
        denominatorLine();

        System.out.println("try to input duplicate pair again");
        map.put(3, emp3);
    }

    static void print(Map<Integer, Employee> map) {
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println("ID - " + entry.getKey() + ", " + entry.getValue());
        }
    }

    static void denominatorLine (){
        System.out.println("-".repeat(30));
    }

    // method's didn't mutate original map, just print map in needed orders
    static void sortBySalaryAscending(Map<Integer, Employee> map) {
        List<Map.Entry<Integer, Employee>> set = new ArrayList<>(map.entrySet());
        set.sort(new Comparator<>() {

            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return Integer.compare(o1.getValue().getSalary(), o2.getValue().getSalary());
            }
        });
        System.out.println("\nOur map after sorting in ASCENDING order by 'salary':");
        for (var entry : set) {
            System.out.println("ID - " + entry.getKey() + ", " + entry.getValue());
        }
    }

    static void sortBySalaryDescending(Map<Integer, Employee> map) {
        List<Map.Entry<Integer, Employee>> set = new ArrayList<>(map.entrySet());
        set.sort(new Comparator<>() {

            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return Integer.compare(o2.getValue().getSalary(), o1.getValue().getSalary());
            }
        });
        System.out.println("\nOur map after sorting in DeSCENDING order by 'salary':");
        for (var entry : set) {
            System.out.println("ID - " + entry.getKey() + ", " + entry.getValue());
        }
    }

    static void sortByNameAscending(Map<Integer, Employee> map) {
        List<Map.Entry<Integer, Employee>> set = new ArrayList<>(map.entrySet());
        set.sort(new Comparator<>() {

            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });
        System.out.println("\nOur map after sorting in ASCENDING order by 'name':");
        for (var entry : set) {
            System.out.println("ID - " + entry.getKey() + ", " + entry.getValue());
        }
    }

    static void sortByNameDescending(Map<Integer, Employee> map) {
        List<Map.Entry<Integer, Employee>> set = new ArrayList<>(map.entrySet());
        set.sort(new Comparator<>() {

            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return o2.getValue().getName().compareTo(o1.getValue().getName());
            }
        });
        System.out.println("\nOur map after sorting in DeSCENDING order by 'name':");
        for (var entry : set) {
            System.out.println("ID - " + entry.getKey() + ", " + entry.getValue());
        }
    }


    //PS - this task is large, so I didn't implement sorting by 'position' or 'ID'
    // The main thing here - do not miss pairs, where sorting criteria duplicated

}
