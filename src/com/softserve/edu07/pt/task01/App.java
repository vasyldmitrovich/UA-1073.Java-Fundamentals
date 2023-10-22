package com.softserve.edu07.pt.task01;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animalsVoiceFeed(animals);
    }

    public static void animalsVoiceFeed(Animal[] animals) {//Good
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + i + " Voice: " + animals[i].voice() + " Feed: " + animals[i].feed());
        }
    }
}
