package com.softserve.edu06.hw;

public class Пінгвін extends NonFlyingBird {
    public Пінгвін() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Пінгвін плаває но не вміє літати.");
    }
}
