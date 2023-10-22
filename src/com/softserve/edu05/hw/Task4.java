package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int userGuess;

        System.out.println("Спробуйте вгадати випадкове число від " + minRange + " до " + maxRange);

        do {
            System.out.print("Введіть ваше припущення: ");
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess < randomNumber) {
                System.out.println("Занадто мале, спробуйте ще раз.");
            } else if (userGuess > randomNumber) {
                System.out.println("Занадто велике, спробуйте ще раз.");
            }
        } while (userGuess != randomNumber);

        System.out.println("Ви вгадали число " + randomNumber + " за " + attempts + " спроб!");
    }

}
