package com.softserve.edu06.hw.Task1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    protected Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }
}
