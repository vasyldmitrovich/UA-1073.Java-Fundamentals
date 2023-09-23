package com.softserve.edu03.hw.Task1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Form rectengl1 = new Form();

        System.out.println("Input first side: ");
        int side1 = scanner.nextInt();

        System.out.println("Input second side: ");
        int side2 = scanner.nextInt();

        System.out.println("Input third side: ");
        int side3 = scanner.nextInt();

        double result = rectengl1.pResult(side1, side2, side3);
        System.out.println("Result: " + result);

    }
}
