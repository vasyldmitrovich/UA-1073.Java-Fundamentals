package com.softserve.edu05;
import java.util.Scanner;

public class hw2 {//Name of class should start from Upper case character
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {//Ok
            System.out.print("Введіть перше число ");
            double n = scanner.nextDouble();

            System.out.print("Введіть друге число ");
            double n1 = scanner.nextDouble();

            double sum = n + n1;
            System.out.println("Сума " + sum);

            System.out.print("Бажаєте виконати операцію ще раз? Так(1)/Ні(2) ");
            choice = scanner.nextInt();
        } while (choice == 1);

    }
}
