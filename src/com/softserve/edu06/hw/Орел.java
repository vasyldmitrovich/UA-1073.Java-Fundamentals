package com.softserve.edu06.hw;

public class Орел extends FlyingBird {
    public Орел() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Орел літає високо в небі.");
    }
}


