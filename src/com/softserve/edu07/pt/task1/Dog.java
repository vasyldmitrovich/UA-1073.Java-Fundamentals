package com.softserve.edu07.pt.task1;

public class Dog implements Animal{
    private int dogNum;

    public Dog(int dogNum) {
        this.dogNum = dogNum;
    }

    public int getDogNum() {
        return dogNum;
    }

    @Override
    public void animalNum() {
        System.out.println(dogNum);
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void feed() {
        System.out.println("Dog feed");
    }
}
