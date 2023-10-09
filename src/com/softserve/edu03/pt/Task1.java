package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {//You already have main method in class App.java
    //Here write some method and call this method in class App.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("input the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("input the third number: ");
        double num3 = scanner.nextDouble();

        double getTotalSum = num1 + num2 +num3;
        double getAverage = getTotalSum / 3;
        System.out.println( "The Totalsum: " + getTotalSum);
        System.out.println("The Average: " + getAverage);


    }
}
