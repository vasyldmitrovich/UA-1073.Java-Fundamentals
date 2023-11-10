package com.softserve.edu06.hw;

abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public abstract void fly();
}

class FlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Flying bird is flying.");
    }
}

class NonFlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Non-flying bird cannot fly.");
    }
}

public class hw1 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.feathers + ", Lay Eggs: " + bird.layEggs);
        }
    }
}

class Eagle extends FlyingBird {
}

class Swallow extends FlyingBird {
}

class Penguin extends NonFlyingBird {
}

class Kiwi extends NonFlyingBird {
}

