package com.softserve.edu07.additional;

import java.util.Arrays;

public class Leetspeak extends Encoder{

    private static String change(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = switch (a[i].toLowerCase()) {
                case "a" -> "4";
                case "e" -> "3";
                case "l" -> "1";
                case "m" -> "/^^\\";
                case "o" -> "0";
                case "u" -> "(_)";
                default -> a[i];
            };
        }
        return Arrays.toString(a);
    }

    @Override
    public String encode(String source) {
        // TODO - Encode the source string into a 133tSp34k string
        if (source == null) {
            return "";
        } else {
            char[] chars = source.toCharArray();
            String[] arr = new String[chars.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = String.valueOf(chars[i]);
            }
            change(arr);
            String res = "";
            for (String a: arr) {
                res += a;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Leetspeak a = new Leetspeak();
        System.out.println(a.encode("abcdef"));
    }
}

abstract class Encoder {
    public abstract String encode(String source);
}