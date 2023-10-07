package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird {
    public Swallow (boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString () {
        return "I'm a swallow, " + super.toString();
    }
}
