package com.softserve.edu07.pt.Task1;

public class App {
    public class Task1 {
        public static void main(String[] args) {
            Animal[] homePets = new Animal[2];
            homePets[0] = new Dog("Foofy", "labrador");
            homePets[1] = new Cat("Tom", "british shorthair");

            for (Animal animal : homePets) {
                animal.voice();
                animal.feed();
            }
        }
    }
}
