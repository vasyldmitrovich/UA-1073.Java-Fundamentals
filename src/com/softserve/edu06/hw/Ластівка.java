package com.softserve.edu06.hw;

public class Ластівка extends FlyingBird {
    public Ластівка() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Ластівка красиво вирує небом.");
    }
}
