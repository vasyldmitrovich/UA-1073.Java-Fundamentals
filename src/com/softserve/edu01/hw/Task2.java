package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String whatName = "What is your name?";
        String whatAdress = "Where do you life ";

        System.out.println(whatName);
        Scanner scan1 = new Scanner(System.in);
        String answerName = scan1.nextLine();
        System.out.println(whatAdress + answerName + "?");
        Scanner scan2 = new Scanner(System.in);
        String answer2 = scan2.nextLine();
        System.out.println("You are " + answerName + ", from " + answer2 + ".");


    }

}
