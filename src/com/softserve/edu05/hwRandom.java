package com.softserve.edu05;
import java.util.Random;
import java.util.Scanner;

public class hwRandom {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        int attempts = 0;
        int userGuess;

        System.out.println("Моє чило знаходиться між " + minRange + " та " + maxRange + ". Спробуй вгадати.");

        do {
            System.out.print("Ваші припущення: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Занадто мале, спробуй ще раз.");
            } else if (userGuess > randomNumber) {
                System.out.println("Занадто велике, спробуй ще раз.");
            } else {
                System.out.println("Вітаю, ви вгадали число " + randomNumber + " за " + attempts + " спроб ");
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}
