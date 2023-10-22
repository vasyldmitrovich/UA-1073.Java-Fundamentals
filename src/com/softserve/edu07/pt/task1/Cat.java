package com.softserve.edu07.pt.task1;

public class Cat implements Animal{
    @Override
    public String voice() {
        return "Meow, meow!!!";
    }

    @Override
    public String feed() {
        return "I like to eat fish.";
    }
}
