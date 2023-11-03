package com.softserve.edu07.pt;

public class Task_1 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Cat();


        for (var animal : animals) {
            animal.feed();
        }
        for (var animal : animals) {
            animal.voice();
        }


    }
}


class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("eating cat food");
    }

    @Override
    public String toString() {
        return "Cat ";
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("guff");
    }

    @Override
    public void feed() {
        System.out.println("eating dog food");
    }

    @Override
    public String toString() {
        return "Dog ";
    }
}


interface Animal {
    void voice();

    void feed();

}
