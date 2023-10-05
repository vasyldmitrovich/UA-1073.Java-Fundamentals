package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

class RandomNumberGame {

    static void game() {
        System.out.println("""
                I want to play a game.
                Try to guess number
                Input the number:""");
        Scanner sc = new Scanner(System.in);
        int random = new Random().nextInt(-100, 100);
        int temp;
        do {
            temp = sc.nextInt();
            if (temp > random) {
                System.out.println("Too high, try again.");
            } else if (temp < random) {
                System.out.println("Too low, try again.");
            }
        } while (temp != random);
        System.out.println("Finally");
    }

}
