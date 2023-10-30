package com.softserve.edu08.hw.Task1;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static class FullName {
         String firstName;
         String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    void info() {
        System.out.print("First name: " + fullName.firstName + " Last name: " + fullName.lastName + " Age: " + age);
    }

    abstract String activity();
}
