package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 2 numbers: ");
        float xf = scanner.nextFloat();
        float yf = scanner.nextFloat();
        System.out.println("ОДЗ чисел [-5; 5]");
        Thread.sleep(1400);
        if (xf >= -5 && xf <= 5 && yf >= -5 && yf <= 5) {
            System.out.println("Входить в ОДЗ");
        } else {
            System.out.println("Не входить в ОДЗ");
        }
        scanner.close();
    }
}

