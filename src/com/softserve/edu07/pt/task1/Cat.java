package com.softserve.edu07.pt.task1;

public class Cat implements Animal{
    private int catNum;

    public Cat(int catNum) {
        this.catNum = catNum;
    }

    public int getCatNum() {
        return catNum;
    }

    @Override
    public void animalNum() {
        System.out.println( catNum);
    }

    @Override
    public void voice() {
        System.out.println("May");
    }

    @Override
    public void feed() {
        System.out.println("Cat feed");
    }
}
