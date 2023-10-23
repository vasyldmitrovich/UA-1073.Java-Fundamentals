package com.softserve.edu06.hw;

public class Main { public static void main(String[] args) {
    Bird[] birds = new Bird[4];
    birds[0] = new Орел();
    birds[1] = new Ластівка();
    birds[2] = new Пінгвін();
    birds[3] = new Ківі();

    for (Bird bird : birds) {
        bird.displayInfo();
        bird.fly();
        System.out.println();
    }

    }
}