package com.softserve.edu03.hw.task2;

import java.util.Scanner;

public class SmallestNumber {//Nice
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Найменше число з даних");
        System.out.print("Введіть перше число: ");


        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        int smallest = findNumber(num1, num2, num3);

        System.out.println("The smallest number is: " + smallest);

    }
    public static int findNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }

}
