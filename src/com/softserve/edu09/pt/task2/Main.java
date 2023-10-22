package com.softserve.edu09.pt.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        SimpleNumber simpleNumber = new SimpleNumber();
        System.out.println("Enter integers separated by commas");
        String lineNumbers = SCANNER.nextLine();

        try {
            simpleNumber.addNumbers(lineNumbers);

            System.out.printf("The numbers you entered (without duplicates and sorted): %s%n", Arrays.toString(simpleNumber.getNumber()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
