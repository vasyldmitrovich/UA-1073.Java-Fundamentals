package com.softserve.edu13.hw.task1;


public class App {
    public static void main(String[] args) {

        Cipher encrypt = App::encrypt;
        Cipher decrypt = App::decrypt;

        String message = "abc";
        System.out.println("Starting message: " + message);

        String encryptedMessage = encrypt.code(message, 5);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt.code(encryptedMessage, 5);
        System.out.println("Decrypted message: " + decryptedMessage);

    }

    public static String encrypt(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char letter : arr) {
            char newLetter = (char) (letter + n);
            result.append(newLetter);
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char letter : arr) {
            char newLetter = (char) (letter - n);
            result.append(newLetter);
        }
        return result.toString();
    }
}
