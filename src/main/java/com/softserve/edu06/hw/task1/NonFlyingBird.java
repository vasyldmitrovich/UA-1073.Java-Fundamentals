package com.softserve.edu06.hw.task1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
