package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyingBird {
    public Penguin (boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString () {
        return "I'm a penguin, " + super.toString();
    }
}
