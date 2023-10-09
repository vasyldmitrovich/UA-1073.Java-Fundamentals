package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Nonflying Bird"+super.toString();
    }
    @Override
    public void fly() {
        System.out.println("I can`t fly:(");
    }
}
