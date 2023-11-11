package com.softserve.edu13.hw.task01;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter string to encrypt: ");
        String str = SCANNER.nextLine();
        System.out.print("Enter key to encrypt: ");
        int key = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Encrypted string: " + encrypt(str, key));
        System.out.println("Decrypted string: " + decrypt(encrypt(str, key), key));
    }

    public static String encrypt(String s, int n) {
        return secure(s, n, (a, b) -> a + b);
    }

    public static String decrypt(String s, int n) {
        return secure(s, n, (a, b) -> a - b);
    }

    public static String secure(String s, int n, BiFunction<Integer, Integer, Integer> func) {
        var chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            int value = chArr[i];
            int secureValue = func.apply(value, n);
            chArr[i] = (char) secureValue;
        }
        return new String(chArr);
    }
}
