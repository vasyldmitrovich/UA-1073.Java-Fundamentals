package com.softserve.edu06.hw.task1;

abstract class NonFlyingBird extends Bird {//NonFlyingBird should not be abstract
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " - птах, який не літає.");
    }

    public abstract String getType();
}
