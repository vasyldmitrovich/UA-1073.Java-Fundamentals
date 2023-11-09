package com.softserve.edu12.hw;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Division {
    static Scanner sc = new Scanner(System.in);

    public static void div() {
        System.out.println("Lets try to divide 2 double numbers(a / b).");
        double a;
        double b;
        while (true) {
            try {
                System.out.println("Input first number (numerator):");
                a = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input double number. Lets try again.");
            } catch (NullPointerException e) {
                System.out.println("Number cant be 'null'. Lets try again.");
            } catch (NoSuchElementException e) {
                System.out.println("Input was empty. Lets try again.");
            } catch (IllegalStateException e) {
                throw new RuntimeException("Sorry, some technical error. Scanner was closed");
            }
        }


        while (true) {
            try {
                System.out.println("Input second number (denominator):");
                b = Double.parseDouble(sc.nextLine());
                if (b == 0) {
                    System.out.println("Denominator can't be 0.0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input double number. Lets try again.");
            } catch (NullPointerException e) {
                System.out.println("Number cant be 'null'. Lets try again.");
            } catch (NoSuchElementException e) {
                System.out.println("Input was empty. Lets try again.");
            } catch (IllegalStateException e) {
                throw new RuntimeException("Sorry, some technical error. Scanner was closed");
            }
        }

        System.out.printf("The result of dividing '%s' and '%s' is - %s", a, b, a / b);

    }
}
