package com.softserve.edu03.hw.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle t1 = new Triangle();
        System.out.println("Input side 1");
        t1.setA(scanner.nextInt());
        System.out.println("Input side 2");
        t1.setB(scanner.nextInt());
        System.out.println("Input side 3");
        t1.setC(scanner.nextInt());
        t1.printResult();
    }
}
