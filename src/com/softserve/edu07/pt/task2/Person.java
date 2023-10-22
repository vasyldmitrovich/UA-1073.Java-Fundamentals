package com.softserve.edu07.pt.task2;

public abstract class Person {
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String print();
    public abstract TypePerson getType();

    protected static void printTypePerson(TypePerson type){
        System.out.printf("Creating a %s.%n", type.typeName());
    }
}