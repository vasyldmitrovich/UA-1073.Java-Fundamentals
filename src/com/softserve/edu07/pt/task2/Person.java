package com.softserve.edu07.pt.task2;

public abstract class Person {
    public String name;

    abstract void print();

    public Person (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
