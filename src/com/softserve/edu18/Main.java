package com.softserve.edu18;;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    // Expecting --data names.txt in command line
    public static void main(String[] args) {
        if (args.length == 2 && args[0].equals("--data")) {
            People people = new People(args[1]);
            userMenu(people);
        }
    }

    private static String promptLine() {
        System.out.print("> ");
        return SCANNER.nextLine();
    }

    private static String promptLine(String message) {
        System.out.println(message);
        return promptLine();
    }

    private static void userMenu(People people) {
        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Search information.");
            System.out.println("2. Print all data.");
            System.out.println("0. Exit.");
            switch (promptLine()) {
                case "0" -> {
                    System.out.println("\nBye!");
                    return;
                }
                case "1" -> {
                    switch (promptLine("\nSelect a matching strategy: ALL, ANY, NONE").toLowerCase()) {
                        case "all" -> people.printAll(promptLine("\nEnter a name or email to search all suitable people."));
                        case "any" -> people.printAny(promptLine("\nEnter a name or email to search all suitable people."));
                        case "none" -> people.printNone(promptLine("\nEnter a name or email to search all suitable people."));
                        default -> System.out.println("\nIncorrect option! Try again.");
                    }
                }
                case "2" -> people.print();
                default -> System.out.println("\nIncorrect option! Try again.");
            }
        }
    }
}