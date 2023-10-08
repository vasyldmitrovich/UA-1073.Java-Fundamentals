// 1. Create abstract class called Bird with attributes feathers and layEggs and an abstract fly() method.
abstract class Bird {
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
class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird cannot fly.");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }
}

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            System.out.println("Bird: " + bird.getClass().getSimpleName());
            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays Eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println("-----------");
        }
    }
}
