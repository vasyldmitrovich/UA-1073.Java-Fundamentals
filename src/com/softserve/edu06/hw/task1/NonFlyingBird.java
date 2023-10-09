package com.softserve.edu06.hw.task1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird cannt fly");
    }

}
