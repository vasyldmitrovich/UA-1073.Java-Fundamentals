package com.softserve.edu07.pt.Task2;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
}
