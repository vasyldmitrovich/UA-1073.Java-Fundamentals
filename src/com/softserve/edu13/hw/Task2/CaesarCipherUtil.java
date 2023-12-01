package com.softserve.edu13.hw.Task1;
import java.util.stream.Collectors;

public class CaesarCipherUtil {

        public static String encrypt(String s, int n) {
            return s.codePoints()
                    .map(c -> Character.isLetter(c) ?
                            (c <= 'Z' && c + n > 'Z' || c >= 'a' && c + n > 'z') ?
                                    c + n - 26 : c + n :
                            c)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
        }

        public static String decrypt(String s, int n) {
            return encrypt(s, -n);
        }
    }
