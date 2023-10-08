package com.softserve.edu06.hw.task01;

import javax.sound.midi.Soundbank;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I am eagle. ");
        super.fly();
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }

}
