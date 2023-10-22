package com.softserve.edu06;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private boolean canFly;

    public Bird(boolean feathers, boolean layEggs, boolean canFly) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.canFly = canFly;

    }

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }

    public boolean canFly() {
        return canFly;
    }


    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

//WHY ALL CLASSES IS INNER. IT IS NOT GOOD
class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs, boolean canFly) {
        super(feathers, layEggs, canFly);
    }

    @Override
    public void fly() {
        System.out.println("The " + getClass().getSimpleName() + " flies.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs, boolean canFly) {
        super(feathers, layEggs, canFly);
    }

    @Override
    public void fly() {
        System.out.println("The bird cannot fly.");
    }
}

class Kiwi extends NonFlyingBird {

    public Kiwi(boolean feathers, boolean layEggs, boolean canFly) {
        super(true, true, false);
    }
}

class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs, boolean canFly) {
        super(false, true, false);
    }
}

class Swallow extends FlyingBird {

    public Swallow(boolean feathers, boolean layEggs, boolean canFly) {
        super(true, true, true);
    }
}

class Eagle extends NonFlyingBird {
    public Eagle(boolean feathers, boolean layEggs, boolean canFly) {
        super(true, true, true);
    }
}

class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new FlyingBird(true, true, true),
                new NonFlyingBird(true, true, false),
                new Kiwi(true, true, false),
                new Swallow(true, true, true),
                new Eagle(true, true, true),
                new Penguin(true, true, false)

        };
        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + ": ");
            System.out.println("  Can fly: " + bird.canFly());
            System.out.println("  Has feathers: " + bird.hasFeathers());
            System.out.println("  Lays eggs: " + bird.laysEggs());
        }
    }
}

