package com.softserve.edu05.hw;

import com.softserve.edu05.CommonTools;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int MAX_NUM = 100;

    public static void guessNumber(){
        int requiredNum = RANDOM.nextInt(MAX_NUM + 1);
        int userNum;

        do{
            System.out.printf("I guessed a number between 0 and %d. Try to guess it.%n", MAX_NUM);
            userNum = CommonTools.readLineAndConvertToNumber("Your number: ", Integer.class);

            if(requiredNum < userNum){
                System.out.println("Too high, try again");
            }
            else if(requiredNum > userNum){
                System.out.println("Too low, try again");
            }
            System.out.println();
        }while (requiredNum != userNum);

        System.out.printf("Congratulations, you guessed my intended number. This is %d%n", requiredNum);
    }
}
