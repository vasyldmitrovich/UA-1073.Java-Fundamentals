package com.softserve.edu04.hw;

public class Task1 {

    static void oldestDog(Dog a, Dog b, Dog c) {//Move to class for example Task1.java
        Dog temp;
        if (a.getAge() > b.getAge() && a.getAge() > c.getAge()) {
            temp = a;
        } else if (b.getAge() > a.getAge() && b.getAge() > c.getAge()) {
            temp = b;
        } else {
            temp = c;
        }
        System.out.println(temp.getName() + " is he oldest dog. " + temp.getName() + " is " + temp.getName() + " years old");
    }
}
