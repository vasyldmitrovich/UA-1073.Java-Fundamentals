package com.softserve.edu01.hw;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Як вас звати?");
        String name = sc.nextLine();
        System.out.println("Де ви живете, " + name + "?");
        String address = sc.nextLine();
        System.out.println(name + " " + address);

    }

}
