package com.softserve.edu06.hw.Task1;

public class NonFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("This bird can`t fly!");
    }

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

}
