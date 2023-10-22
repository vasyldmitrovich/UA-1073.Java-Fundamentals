package com.softserve.edu06.hw.task1;

abstract class FlyingBird extends Bird {//FlyingBird should not be abstract
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " - літаючий птах, він літає.");
    }

    public abstract String getType();
}

