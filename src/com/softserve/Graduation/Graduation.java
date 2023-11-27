package com.softserve.Graduation;

import java.util.Scanner;

public class Graduation {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Bob", "2023");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String name, String birthYear) {
        System.out.println("Hello! My name is " + name + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();
        int yourAge = (age1 * 70 + age2 * 21 + age3 * 15) % 105;
        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int age = scanner.nextInt();
        for (int i = 0; i <= age; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed!");
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        for (int i = 0; i <= 4; i++) {
            int test = scanner.nextInt();
            if (test == 1){
                System.out.println("Please, try again.");
            }if (test == 2){
                break;
            }if (test == 3){
                System.out.println("Please, try again.");
            }if (test == 4){
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

