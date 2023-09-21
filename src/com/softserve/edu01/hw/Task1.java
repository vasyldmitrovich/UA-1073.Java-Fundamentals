package com.softserve.edu01.hw;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input radiu5s:");
        int radius= console.nextInt();
        System.out.printf("Perimeter is %.7f\n", 2 * Math.PI * radius);
        System.out.printf("Area is %.7f\n", Math.PI * radius * radius);
    }
}
