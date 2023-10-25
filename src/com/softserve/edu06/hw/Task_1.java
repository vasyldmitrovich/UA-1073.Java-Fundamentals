package com.softserve.edu06.hw;

public class Task_1 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("gray", true),
                new Swallow("black", true),
                new Penguin("black and white", true),
                new Kiwi("grayish brown", true)
        };
        for (var bird : birds) {
            bird.fly();
        }
        for (var bird : birds) {
            System.out.println(bird);
        }

    }
}

abstract class Bird {
    private String Feathers;
    private boolean LayEggs;

    public Bird(String feathers, boolean layEggs) {
        Feathers = feathers;
        LayEggs = layEggs;
    }

    public String getFeathers() {
        return Feathers;
    }

    public boolean isLayEggs() {
        return LayEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Feathers='" + Feathers + '\'' +
                ", LayEggs=" + LayEggs +
                '}';
    }

    abstract void fly();
}


class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "FlyingBird{}";
    }

    @Override
    void fly() {
        System.out.println("Flying Bird " + getClass());
    }
}


class Eagle extends FlyingBird {

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle = " + getFeathers() + " , " +
                " layEggs = " + " yes";
    }

}


class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow = " + getFeathers() + " , " +
                " layEggs = " + " yes";
    }
}


class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {

    }


}


class Penguin extends NonFlyingBird {

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin = " + getFeathers() + " , " +
                " layEggs = " + " yes";
    }
}


class Kiwi extends NonFlyingBird {

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi = " + getFeathers() + " , " +
                " layEggs = " + " yes";
    }
}