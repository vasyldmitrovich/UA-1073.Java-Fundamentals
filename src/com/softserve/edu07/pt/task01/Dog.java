package com.softserve.edu07.pt.task01;

public class Dog implements Animal{
    @Override
    public String voice() {
        return "Woof!";
    }

    @Override
    public String feed() {
        return "Meat";
    }
}
