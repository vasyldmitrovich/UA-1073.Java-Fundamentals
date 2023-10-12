package com.softserve.edu07.pt.task02;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        super();
        System.out.println("Person type " + TYPE_PERSON + " created.");
    }

    public Cleaner(String name) {
        super(name);
        System.out.println("Person type " + TYPE_PERSON + " created.");
    }

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public double salary() {
        return 34999.00;
    }
}
