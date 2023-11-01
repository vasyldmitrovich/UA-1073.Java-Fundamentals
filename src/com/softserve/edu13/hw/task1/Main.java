package com.softserve.edu13.hw.task1;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String message = "Create two methods String encrypt(String s, int n) and String decrypt(String s, int n).";
        int shift = 5;

        CaesarsCode encrypt = (s, n) -> s.chars()
                .mapToObj(c -> (char) (c + n))
                .map(Object::toString)
                .collect(Collectors.joining());

        CaesarsCode decrypt = (s, n) -> s.chars()
                .mapToObj(c -> (char) (c - n))
                .map(Object::toString)
                .collect(Collectors.joining());

        String encryptMessage = encrypt.crypt(message, shift);
        String decryptMessage = decrypt.crypt(encryptMessage, shift);

        System.out.println("Message: " + message);
        System.out.println("Encrypted message: " + encryptMessage);
        System.out.println("Decrypted message: " + decryptMessage);
    }
}
