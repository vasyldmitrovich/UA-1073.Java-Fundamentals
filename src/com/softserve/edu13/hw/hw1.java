package com.softserve.edu13.hw;

public class hw1 {
    public static void main(String[] args) {
        String originalText = "abc";
        int shift = 3;
        String encryptedText = encrypt(originalText, shift);
        System.out.println("Encrypted Text: " + encryptedText);
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    private static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + n) % 26 + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }
}
