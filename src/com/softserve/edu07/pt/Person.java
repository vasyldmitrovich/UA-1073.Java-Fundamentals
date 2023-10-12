package com.softserve.edu07.pt;

public abstract class Person {
    public static final String TYPE_PERSON = null;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
