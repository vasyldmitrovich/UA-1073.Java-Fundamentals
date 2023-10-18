package com.softserve.edu07.pt.task1;

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Dog says Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating.");
    }
}

