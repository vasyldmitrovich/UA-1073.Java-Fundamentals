package com.softserve.edu11.hw;

import java.util.*;

public class Greeting {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    private static String randomGreeting() {
        List<String> varieties = new ArrayList<>();
        varieties.add("Pleased to meet you");
        varieties.add("It’s nice to meet you");
        varieties.add("It’s good to see you");
        varieties.add("Hey");
        varieties.add("What’s new");
        try {
            return varieties.get(random.nextInt(0, varieties.size()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something goes wrong. Contact with developer please.");
        }
    }

    public static void toGreet() {

        try {
//        String regex = "\\.*([a-zA-Z-]+)\\s+([a-zA-Z-]+)\\.*";
            String regex = "\\s*([a-zA-Z-]+)\\s+([a-zA-Z-]+)\\s*";
//        String regex = "([a-zA-Z-]+\\s+[a-zA-Z-]+)+";

            System.out.println("Input your first and last name please:");
            String input = sc.nextLine();
            String[] splitted = input.strip().split("\\s+");

            if (splitted.length > 2) {
                System.out.println("Too much words, lets try again.");
                toGreet();
            } else if (input.strip().matches(regex)){
                System.out.printf("%s, %s %s", randomGreeting(), splitted[0], splitted[1]);
            } else {
                System.out.println("\nIncorrect input!\nUse only english letters, spaces, and hyphens.");
                toGreet();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something goes wrong. Contact with developer please.");
        }
    }
}
