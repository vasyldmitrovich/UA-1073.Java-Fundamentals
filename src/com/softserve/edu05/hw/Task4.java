package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void run() {
        var rnd = new Random();
        var console = new Scanner(System.in);
        int enValue;
        int rndValue = rnd.nextInt(1000) + 1;
        do {
            System.out.print("Guess my secret number from 1 to 1000: ");
            enValue = console.nextInt();
            console.nextLine();
            System.out.println(enValue > rndValue ? "Too high,try again" : enValue < rndValue ? "Too low, try again" : "You guess!");
        } while (enValue != rndValue);
    }
}
