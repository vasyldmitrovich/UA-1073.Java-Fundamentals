package com.softserve.edu13.hw.task1;

public class App {
    public static void main(String[] args) {
        String originalText = "abc";
        int shift = 3;

        String encryptedText = encrypt(originalText, shift);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted: " + decryptedText);
    }
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (ch + n);

                if ((Character.isLowerCase(ch) && encryptedChar > 'z') || (Character.isUpperCase(ch) && encryptedChar > 'Z')) {
                    encryptedChar = (char) (ch - (26 - n));
                }
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }
}