package com.softserve.edu07.pt.pt2;

public abstract class Person {
    private static final String TYPE_PERSON = "Person";
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
