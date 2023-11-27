package com.softserve.edu13.hw.Task1;

public class Main {

    public static void main(String[] args) {
        String message = "Create two methods String encrypt(String s, int n) and String decrypt(String s, int n).";
        int shift = 5;

        String encryptedMessage = CaesarCipherUtil.encrypt(message, shift);
        String decryptedMessage = CaesarCipherUtil.decrypt(encryptedMessage, shift);

        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}


