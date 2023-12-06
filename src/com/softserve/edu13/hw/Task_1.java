package com.softserve.edu13.hw;

public class Task_1 {
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + n) % 26 + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    public static void main(String[] args) {
        String original = "abc";
        int shift = 3;


        String encrypted = encrypt(original, shift);
        System.out.println("Encrypted: " + encrypted);


        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
