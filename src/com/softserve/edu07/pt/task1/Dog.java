package com.softserve.edu07.pt.task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("guff");

    }

    @Override
    public void feed() {
        System.out.println("eating dog food");

    }

    @Override
    public String toString() {
        return "";
    }
}
