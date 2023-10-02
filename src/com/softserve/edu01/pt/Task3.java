package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       // System.out.println("a + b = " + (a + b)); як варіант стандартного коду
        System.out.printf("%d + %d = %d\n", a, b, a + b); //більш красиве форматування; \n - це перенос форматованого прінтлайна на наступний рядок
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
    }
}
