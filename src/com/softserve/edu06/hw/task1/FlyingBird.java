package com.softserve.edu06.hw.task1;

public class FlyingBird extends Bird {
    public FlyingBird (boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly () {
        System.out.println("I'm flying");
    }

    @Override
    public String toString () {
        return super.toString() + ", I can fly";
    }
}
