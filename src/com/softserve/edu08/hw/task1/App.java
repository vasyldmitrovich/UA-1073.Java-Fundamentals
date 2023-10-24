package com.softserve.edu08.hw.task1;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(new Person.FullName("Oleksiy", "Zinnyk"), 18) {
            @Override
            public String activity() {
                return "Working";
            }
        };
        System.out.println(person1.info());
    }
}
