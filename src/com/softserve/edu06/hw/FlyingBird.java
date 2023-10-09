package com.softserve.edu06.hw;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Flying Bird" + super.toString();
    }

    @Override
    public void fly() {
        System.out.println("I`m flying!");
    }
}
