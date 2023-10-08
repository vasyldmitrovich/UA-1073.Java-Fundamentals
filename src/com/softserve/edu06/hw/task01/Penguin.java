package com.softserve.edu06.hw.task01;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I am penguin. ");
        super.fly();
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
