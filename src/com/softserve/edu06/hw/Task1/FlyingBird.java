package com.softserve.edu06.hw.Task1;

public class FlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("This bird can fly!");
    }

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Flying Bird{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
