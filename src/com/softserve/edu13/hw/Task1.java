package com.softserve.edu13.hw;

import java.util.stream.Collectors;

@FunctionalInterface
interface CryptString {
    String crypt (String s, int n);
}

public class Task1 {
    public static void main (String[] args) {
        CryptString encrypt = (s, n) -> s.codePoints()
                .mapToObj(v -> v + n)
                .map(Character::toChars)
                .map(String::valueOf)
                .collect(Collectors.joining());

        CryptString decrypt = (s, n) -> s.codePoints()
                .mapToObj(v -> v - n)
                .map(Character::toChars)
                .map(String::valueOf)
                .collect(Collectors.joining());

        var encrypted = encrypt.crypt("abc", 3);
        var decrypted = decrypt.crypt("def", 3);
        System.out.println(encrypted + " " + decrypted);
    }
}
