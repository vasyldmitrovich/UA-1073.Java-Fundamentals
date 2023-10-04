package com.softserve.edu05.hw.task4;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(11);
        int userNum;
        do {
            System.out.println("Try to guess number from 0 to 10");
            userNum = scanner.nextInt();

            if (userNum > randomNum){
                System.out.println("Too high, try again");
            } else if (userNum < randomNum) {
                System.out.println("Too low, try again");
            }

        }while (userNum != randomNum);
        System.out.println("You are right the number is "+ randomNum);
    }
}
