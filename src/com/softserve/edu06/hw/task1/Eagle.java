package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird {
    public Eagle (boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString () {
        return "I'm an eagle, " + super.toString();
    }
}
