package com.softserve.edu10.pt.task2;

import java.util.Comparator;

public class Main {
    private static final int COUNT_EMPLOYEE = 5;
    public static void main(String[] args) {
        SimpleDB db = new SimpleDB();
        insertData(db);
        print(db);
        update(db);
        print(db);
        sort(db);
    }

    private static void insertData(SimpleDB db){
        System.out.println("Add employees");
        int i = 1;
        while (i <= COUNT_EMPLOYEE){
            System.out.printf("Create employee #%d%n", i);
            if(!db.addEmployee()){
               continue;
            }
            ++i;
            System.out.println();
        }
    }

    private static void print(SimpleDB db){
        System.out.println("Employee info");
        for(var employee : db.getDatabase().entrySet()){
            System.out.printf("Id: %d, %s%n", employee.getKey(), employee.getValue());
        }
        System.out.println();
    }

    private static void update(SimpleDB db){
        System.out.println("Update user data");
        while (true){
            if(db.updateDataEmployee()){
                return;
            }
        }
    }

    private static void sort(SimpleDB db){
        System.out.println("Sort in ascending order of keys");
        db.sortDB();
        print(db);

        System.out.println("Sort in descending order of keys");
        db.sortDB(Comparator.reverseOrder());
        print(db);

        System.out.println("Sort by employee names in ascending order");
        db.sortDB(Employee::getName);
        print(db);

        System.out.println("Sort by employee position in ascending order");
        db.sortDB(Employee::getPosition);
        print(db);

        System.out.println("Sort by employee salary in ascending order");
        db.sortDB(Employee::getSalary);
        print(db);
    }
}
