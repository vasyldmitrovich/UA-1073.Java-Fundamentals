package com.softserve.edu13.hw.Task1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EncriptDecript {
   static Scanner SCANNER = new Scanner(System.in);
   static public String promptText () {
       System.out.println("Input text");
       String text = SCANNER.nextLine();
       return text;
   }
    static public int promptNumberToMove () {
        System.out.println("Input number to move");
        int num = Integer.parseInt(SCANNER.nextLine());
        return num;
    }
    public static String encrypt(String s, int n) {
       char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] +=  n;
        }
        System.out.println(new String(chars));
       return new String(chars);
    }
   public static String decrypt(String s, int n) {
       char [] chars = s.toCharArray();
       for (int i = 0; i < chars.length; i++) {
           chars[i] -=  n;
       }
       System.out.println(new String(chars));
       return new String(chars);
   }
}
