package com.softserve.edu12.pt.Task1;

import java.util.Scanner;

import static com.softserve.edu12.pt.Task1.squareRectangle.rectangleArea;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("input a ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("input b ");
                int b = Integer.parseInt(scanner.nextLine());
                int area = rectangleArea(a, b);
                System.out.println("Area: " + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: sides must be numbers");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

