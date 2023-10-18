package com.softserve.edu05.hw;

import com.softserve.edu05.CommonTools;

import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void productNums(){
        String userInput;
        do{
            System.out.println();

            double firstNum = CommonTools.readLineAndConvertToNumber("Enter the first factor: ", Double.class);
            double secondNum = CommonTools.readLineAndConvertToNumber("Enter the second factor: ", Double.class);
            System.out.printf("The result of multiplication: %.4f%n%n", firstNum * secondNum);

            System.out.print("Would you like to continue? (y/n): ");
            userInput = SCANNER.nextLine();
        }while (!userInput.equalsIgnoreCase("n"));
        System.out.println("Enter key was pressed. Exiting...");
    }
}
