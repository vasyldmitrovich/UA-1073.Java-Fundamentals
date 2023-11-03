package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void task() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a radius: ");

        while (true) {
            try {
                int radius = Integer.parseInt(br.readLine());
                System.out.println("Perimeter: " + 2 * Math.PI * radius);
                System.out.println("Area: " + Math.PI * Math.pow(radius, 2));
                break;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error: " + e.getMessage() + "\nTry again.");
            }
        }

    }
}