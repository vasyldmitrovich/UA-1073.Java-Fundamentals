package com.softserve.edu07.pt;

public class Dog implements Animal  {
    @Override
    public void voice() {
        System.out.println("Woff");
    }

    @Override
    public void feed() {
        System.out.println("The dog is fed.");
    }
}
