package com.softserve.edu05.hw;

import java.util.Random;

import static com.softserve.edu05.hw.App.SCANNER;

public class RandomNumber {
    int number;
    static final String HIGH = "Too high, try again";
    static final String LOW = "Too low, try again";
    static final String GUESSED = "GREAT JOB!";

    public RandomNumber () {
        this.number = new Random().nextInt(1, 100);
    }

    public static void guessNumber(int originalNumber) {
        int guessNumber = 0;

        do {
            System.out.println("Enter int from 1 to 100");
            int inputNumber = App.getNumber();
            guessNumber = inputNumber;

            if (inputNumber > originalNumber) {
                System.out.println(RandomNumber.HIGH);
            } else {
                System.out.println(RandomNumber.LOW);
            }
        } while(guessNumber != originalNumber);

        System.out.println(RandomNumber.GUESSED);
    }

    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }
}
