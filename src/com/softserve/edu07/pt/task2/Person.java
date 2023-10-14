package com.softserve.edu07.pt.task2;

abstract class Person {
    protected String name;
    public abstract String getTypePerson();

    public Person(String name) {
        this.name = name;
        System.out.println("Type: " + getTypePerson());
    }

    public abstract void print();
}