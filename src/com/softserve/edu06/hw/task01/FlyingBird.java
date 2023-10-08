package com.softserve.edu06.hw.task01;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }

}
