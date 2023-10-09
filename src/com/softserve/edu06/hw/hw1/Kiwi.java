package com.softserve.edu06.hw.hw1;

public class Kiwi extends NonFlyingBird{

    public Kiwi() {
        setFeathers("KiwiFeathers");
        setLayEggs("can't");
    }

    @Override
    public String fly() {
        return "KIWI can't fly. Better lets RUN with Kiwi.";
    }

    @Override
    public String toString() {
        return "Kiwi have " + getFeathers() + " feathers and " + getLayEggs() +
                " lay eggs.";
    }

}
