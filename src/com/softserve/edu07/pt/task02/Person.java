package com.softserve.edu07.pt.task02;

public abstract class Person {
    private String name;

    public Person() {
        this.name = null;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
}
