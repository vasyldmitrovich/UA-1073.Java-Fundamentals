package com.softserve.edu07.pt.task2;

class Cleaner extends Staff {
    public Cleaner(String name) {
        super(name);
    }

    @Override
    public String getTypePerson() {
        return "Cleaner";
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }

    @Override
    public void salary() {
        System.out.println("Cleaner's salary");
    }
}