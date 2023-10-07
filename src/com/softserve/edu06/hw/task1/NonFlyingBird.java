package com.softserve.edu06.hw.task1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird (boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly () {
        System.out.println("Oops, I'm falling");
    }

    @Override
    public String toString () {
        return super.toString() + ", I can't fly";
    }
}
