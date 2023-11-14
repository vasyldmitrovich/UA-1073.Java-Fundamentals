package com.softserve.edu13.hw;

import java.util.Scanner;

class EncryptionClass {

    static Scanner sc = new Scanner(System.in);

    static Encryption encryption = (string, move) -> {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + move);
        }
        return String.valueOf(array);
    };

    static Encryption decryption = (string, move) -> {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] - move);
        }
        return String.valueOf(array);
    };

    static String encrypt(String string, int n) {
        return  encryption.algorithm(string,n);
    }

    static String decrypt(String string, int n) {
        return  decryption.algorithm(string,n);
    }

    static void code() {
        System.out.println("I can encrypt your massage.\nInput your massage:");
        String string = sc.nextLine();
        System.out.println("Input any number (encrypting key):");
        int key = Integer.parseInt(sc.nextLine());
        String encryptedString = encrypt(string, key);

        System.out.println("Your encryptedString massage:\n " + encryptedString);

        System.out.println("Do you want to decrypt massage? .\nInput 'yes' or 'no':");

        if (sc.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Your decrypted massage:\n " + decrypt(encryptedString, key));
        } else {
            System.out.println("As you wish. Bye!");
        }
    }

}
