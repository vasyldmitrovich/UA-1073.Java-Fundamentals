package com.softserve.edu07.pt.task1;

public class Dog implements Animal{
    @Override
    public String voice() {
        return "Woof, woof!!!";
    }

    @Override
    public String feed() {
        return "I like to eat meat.";
    }
}
