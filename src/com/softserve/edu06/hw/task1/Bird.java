package com.softserve.edu06.hw.task1;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
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

