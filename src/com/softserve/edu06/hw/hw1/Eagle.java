package com.softserve.edu06.hw.hw1;

public class Eagle extends FlyingBird {

    public Eagle() {
        setFeathers("EagleFeathers");
        setLayEggs("can");
    }

    @Override
    public String fly() {
        return "Lets fly with EAGLES";
    }

    @Override
    public String toString() {
        return "Eagle have " + getFeathers() + " feathers and " + getLayEggs() +
                " lay eggs.";
    }
}
