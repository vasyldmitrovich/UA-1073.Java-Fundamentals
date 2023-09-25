package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть вартість дзвінка за одну хвилину розмови: ");
        float c1 = scanner.nextFloat();
        float c2 = scanner.nextFloat();
        float c3 = scanner.nextFloat();
        System.out.println("Вкажіть тривалість дзвінка: ");
        float t1 = scanner.nextFloat();
        float t2 = scanner.nextFloat();
        float t3 = scanner.nextFloat();
        System.out.println("Вартість кожного дзвінка: ");
        System.out.println(c1 * t1);
        System.out.println(c2 * t2);
        System.out.println(c3 * t3);
        System.out.println("Загальна вартість: ");
        System.out.println((c1 * t1) + (c2 * t2) + (c3 * t3));




    }
}
