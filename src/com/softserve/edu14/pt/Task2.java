package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        int count = (int) primes.stream().count();
        System.out.println(count);

        primes.stream().min(Integer::compare).ifPresent(System.out::println);
        primes.stream().max(Integer::compare).ifPresent(System.out::println);
        int sum = primes.stream().reduce(0, (s, i) -> s + i);
        System.out.println(sum);
    }
}
