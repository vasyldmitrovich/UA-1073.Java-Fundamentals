package com.softserve.edu06.hw.Task1;


    class FlyingBird extends Bird {
    public FlyingBird(String feathers) {
        super(feathers, true);
    }

    @Override
    void fly() {
        System.out.println("This bird with " + getFeathers() + " feathers can fly.");
    }
}
    class Eagle extends FlyingBird {
    public Eagle() {
        super("white");
    }
}

    class Swallow extends FlyingBird {
    public Swallow() {
        super("black");
    }
}


