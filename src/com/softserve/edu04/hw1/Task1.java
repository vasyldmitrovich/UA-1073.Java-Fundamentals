package com.softserve.edu04.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        int min = -5;
        int max =  5;

        //Move this logic to some method and call this method here
        if(num1 >= min && num1 <= max){
            System.out.println("First number belong to range [ -5, 5 ]");
        } else{
            System.out.println("First number not belong to range [ -5, 5]");
        }

        if(num2 >= min && num2 <= max){
            System.out.println("Second number belong to range [ -5, 5 ]");
        } else{
            System.out.println("Second number not belong to range [ -5, 5]");
        }

        if(num3 >= min && num3 <= max){
            System.out.println("Third number belong to range [ -5, 5 ]");
        } else{
            System.out.println("Third number not belong to range [ -5, 5]");
        }
    }
}
