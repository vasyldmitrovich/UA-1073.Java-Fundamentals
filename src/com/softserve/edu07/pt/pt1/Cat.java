package com.softserve.edu07.pt.pt1;

public class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("I'm a cat. Meow");
    }

    @Override
    public void feed() {
        System.out.println("You wanna feed me? I like fish.");

    }
}
