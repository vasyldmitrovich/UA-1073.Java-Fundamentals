package com.softserve.edu13.hw.task1;

public class CaesarСipher {
    // метод шифрування
    public static String encrypt(String s, int n) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (ch + n);

                if (Character.isUpperCase(ch)) {
                    if (encryptedChar > 'Z') {
                        encryptedChar = (char) ('A' + (encryptedChar - 'Z' - 1));
                    }
                } else {
                    if (encryptedChar > 'z') {
                        encryptedChar = (char) ('a' + (encryptedChar - 'z' - 1));
                    }
                }
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }

        }
        return result.toString();
    }

    // метод розшифрування
    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static void main(String[] args) {
        String start = "artur";
        int shift = 4;

        String encrypted = encrypt(start, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }


}

