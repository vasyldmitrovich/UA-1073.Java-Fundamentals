package com.softserve.edu07.pt.Task2;

public class Cleaner extends Staff{
    private static final String  TYPE_PERSON = "Cleaner";

    @Override
    void print() {
        System.out.println("I`m " + name + " I`m a " + TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 20;
    }

    public Cleaner(String name) {
        super(name);
    }
}

