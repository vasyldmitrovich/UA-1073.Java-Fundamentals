package com.softserve.edu06.task1;

public class Swallow extends FlyingBird {

    Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getFeathers() + " has " + getLayEggs() + " eggs");
    }
}
