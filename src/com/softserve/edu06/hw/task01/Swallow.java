package com.softserve.edu06.hw.task01;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I am swallow. ");
        super.fly();
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
