package com.softserve.edu06.hw.task01;

public class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I am kiwi. ");
        super.fly();
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
