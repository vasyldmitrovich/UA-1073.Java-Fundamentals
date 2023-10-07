package com.softserve.edu06.hw.task1;

public class Kiwi extends NonFlyingBird {
    public Kiwi (boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString () {
        return "I'm a Kiwi, " + super.toString();
    }
}
