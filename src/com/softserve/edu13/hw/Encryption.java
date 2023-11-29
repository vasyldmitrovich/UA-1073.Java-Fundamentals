package com.softserve.edu13.hw;

public class Encryption {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                index = (index + n) % ALPHABET.length();
                c = ALPHABET.charAt(index);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static void main(String[] args) {
        System.out.println(encrypt("abc", 3));
        System.out.println(decrypt("def", 3));
    }
}