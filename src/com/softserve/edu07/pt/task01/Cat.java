package com.softserve.edu07.pt.task01;

public class Cat implements Animal {

    @Override
    public String voice() {
        return "Meow!";
    }

    @Override
    public String feed() {
        return "Fish";
    }
}
