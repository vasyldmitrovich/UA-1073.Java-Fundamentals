package com.softserve.edu04.pt.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int count = 0;

            if (n1 % 2 == 1) {
                count++;
            };
            if (n2 % 2 == 1) {
                count++;
            };
            if (n3 % 2 == 1) {
                count++;
            };

            System.out.println(count + " of this numbers are odd");
        }
    }
