package com.softserve.edu06.hw.Task1;


    class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers) {
        super(feathers, true);
    }

    @Override
    void fly() {
        System.out.println("This bird with " + getFeathers() + " feathers can't fly.");
    }
}
    class Penguin extends NonFlyingBird {//The same is here
    public Penguin() {
        super("black and white");
    }
}

    class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("brown");
    }
}


