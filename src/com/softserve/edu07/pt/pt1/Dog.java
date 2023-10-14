package com.softserve.edu07.pt.pt1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("I'm a dog. Woof");
    }

    @Override
    public void feed() {
        System.out.println("You wanna feed me? I like bones.");

    }
}
