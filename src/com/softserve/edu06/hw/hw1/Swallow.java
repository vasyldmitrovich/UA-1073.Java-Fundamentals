package com.softserve.edu06.hw.hw1;

public class Swallow extends FlyingBird{

    public Swallow() {
        setFeathers("SwallowFeathers");
        setLayEggs("can");
    }

    @Override
    public String fly() {
        return "Lets fly with SWALLOWS";
    }

    @Override
    public String toString() {
        return "Swallow have " + getFeathers() + " feathers and " + getLayEggs() +
                " lay eggs.";
    }
}
