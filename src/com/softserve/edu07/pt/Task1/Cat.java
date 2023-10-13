package com.softserve.edu07.pt.Task1;

public class Cat implements Animal {
    private String name;
    private String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.println("The cat '" + name + "' which is " + breed
                + " says: MEOW!");
    }

    @Override
    public void feed() {
        System.out.println(name + " loves eat fish.");
    }
}
