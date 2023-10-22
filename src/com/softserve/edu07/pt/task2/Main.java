package com.softserve.edu07.pt.task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Teacher("John", 12500.0),
                new Cleaner("Alice", 10000.0),
                new Student("Bob"),
                new Cleaner("Lisa", 10450.0)
        };

        printPersonInfo(people);
        printSalary(people);
    }

    private static void printPersonInfo(Person[] people){
        System.out.println("Information about people:");
        for (Person person : people) {
            System.out.printf("\t%s", person.print());
        }
    }

    private static void printSalary(Person[] people){
        System.out.println("Information about people's salaries:");
        for (Person person : people) {
            if (person instanceof Staff) {
                System.out.printf("\t%s", ((Staff) person).salary());
            }
        }
    }
}
