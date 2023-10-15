package com.softserve.edu06.hw.task1;

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }
    @Override
    public String getType() {
        return "eagle";
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }
    @Override
    public String getType() {
        return "swallow";
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }
    public void fly() {
        System.out.println("This " + getType() + " cannot fly.");
    }

    @Override
    public String getType() {
        return "penguin";
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }
    @Override
    public void fly() {
        System.out.println("This " + getType() + " cannot fly.");
    }

    @Override
    public String getType() {
        return "kiwi";
    }
}

//можна зробити так? Чи краще якось по-іншому?
