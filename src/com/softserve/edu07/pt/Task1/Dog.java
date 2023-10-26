package com.softserve.edu07.pt.Task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Dog is barking");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating");
    }
}
