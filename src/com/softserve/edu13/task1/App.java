package com.softserve.edu13.task1;

import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        encrypt("abc", 3);
        decrypt("def", 3);
    }
    public static String encrypt(String s, int n) {
        UnaryOperator<String> replace = a -> {
            char[] chars = a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] += n;
            }
            return new String(chars);
        };
        s = replace.apply(s);
        System.out.println(s);
        return s;
    }
    public static String decrypt(String s, int n) {
        UnaryOperator<String> replace = a -> {
            char[] chars = a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] -= n;
            }
            return new String(chars);
        };
        s = replace.apply(s);
        System.out.println(s);
        return s;
    }
}
