package com.softserve.edu06.hw;

public class Ківі extends NonFlyingBird {
    public Ківі() {
        super(false, true);
    }

    @Override
    public void fly() {
        System.out.println("ківі нелітаючий птах.");
    }
}
