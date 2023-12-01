package com.softserve.edu12.hw;

import java.util.Scanner;

public class Task_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Input first number: ");
                double first = Integer.parseInt(scanner.nextLine());
                System.out.println("Input second number: ");
                double second = Integer.parseInt(scanner.nextLine());
                double result = dev(first, second);
            } catch (NumberFormatException e) {
                System.out.println("The sides should be numbers");
                continue;
            }catch (IllegalArgumentException e) {
                System.out.println("There was an error: " + e.getMessage());
            }
            return;
        }
    }

    static double dev(double first, double second){
        if (first < 0 || second <0){
            throw new IllegalArgumentException("sides should not be negative");
        }
        return first/second;
    }



}
