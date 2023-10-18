package com.softserve.edu07.pt.task1;


class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Cat says Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating.");
    }
}
