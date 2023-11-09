package com.softserve.edu11.hw;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class USDollarFormat {
static Scanner sc = new Scanner(System.in);

    public static void usDollar(){
        try {
            System.out.println("Please, input text with US dollars in it:");
            Matcher matcher = Pattern.compile("\\$\\d+.\\d{2}").matcher(sc.nextLine());
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something goes wrong. Contact with developer please.");
        }
    }



}
