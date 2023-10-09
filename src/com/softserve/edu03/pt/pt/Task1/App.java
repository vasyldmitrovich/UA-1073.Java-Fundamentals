package com.softserve.edu03.pt.pt.Task1;
// done
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner (System.in);

    public static void main (String [] args){
        int firstNumber = getNumber("Enter First Number: ");
        int secondNumber = getNumber("Enter Second Number: ");
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + getTotal(firstNumber, secondNumber));
        System.out.println("The averadge of " + firstNumber + " and " + secondNumber + " is " + getAverage(firstNumber, secondNumber));
    }

    private static int getNumber(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static int getTotal (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int getAverage (int firstNumber, int secondNumber){
        return (firstNumber + secondNumber) / 2;
    }
}
