package com.softserve.edu08.hw;

public class Main {

    public static void main() {


        FullName fullName = new FullName("Юрій", "Ігорович");


        Person person = new Person(fullName, 30) {
            @Override
            public String activity() {
                return null;
            }
        };


        System.out.println(person.info());
    }
}

