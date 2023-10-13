package com.softserve.edu07.pt.Task2;

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";


    public Cleaner(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println("My name is: " + getName() + " and I am a '"
                + TYPE_PERSON + "'.");
    }

    @Override
    public void salary() {
        super.salary();
    }
}

