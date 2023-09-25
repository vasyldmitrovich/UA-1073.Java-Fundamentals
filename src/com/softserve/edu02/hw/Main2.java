package com.softserve.edu02.hw;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ведіть ім‘я ");
        String name = scanner.nextLine();
        System.out.println(" Ведіть прізвище ");
        String surname = scanner.nextLine();
        System.out.println( " Where do you live " + name );
        String adress = scanner.nextLine();
        System.out.println(" Тебе звати " + name + " " + surname + " Ти живеш в " + adress);
    }
}