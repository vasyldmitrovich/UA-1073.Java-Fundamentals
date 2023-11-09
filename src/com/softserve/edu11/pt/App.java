package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App {


    public static void main(String[] args) {

//PT 1 - SoftServe Academy
        String first = "SoftServe Academy";
        String second = "SoftServe";
        System.out.println(first.contains(second));

//PT 2 - full name
        PtTwo();

//PT 3 - validation usernames, 5 times
        PtTree();
        PtTree();
        PtTree();
        PtTree();
        PtTree();
    }

    private static void PtTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input username and i show you, does it fit to username rules");
        try {
            String userName = sc.nextLine();
            String regex = "\\w{3,15}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(userName);
            System.out.printf("Username '%s' is %s valid", userName, m.matches() ? "" : "not");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something goes wrong. Contact with developer please.");
        }
    }



    private static void PtTwo() {
        String firstName;
        String middleName;
        String lastName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets input full name step by step and i'll show you what i can.\n" +
                "Input first name(you can ignore case):");
        try {
            firstName = sc.nextLine();
            System.out.println("Input middle name(you can ignore case):");
            middleName = sc.nextLine();
            System.out.println("Input last name(you can ignore case):");
            lastName = sc.nextLine();
            firstName = normalizeCase(firstName);
            middleName = normalizeCase(middleName);
            lastName = normalizeCase(lastName);
            System.out.printf("Last name + initials: %s %s. %s.%n", lastName, firstName.charAt(0), middleName.charAt(0));
            System.out.println("First name - " + firstName);
            System.out.printf("First name, middle name, and last name:  %s %s %s%n", firstName, middleName, lastName);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something goes wrong. Contact with developer please.");
        }
    }

    static String normalizeCase(String input){
        return input.substring(0, 1).toUpperCase() +
                input.substring(1).toLowerCase();
    }
}
