package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pt2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        long count = getCount(primes);
        int min = getMin(primes);
        int max = getMax(primes);
        int sum = getSum(primes);
        System.out.println("Count: " + count);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
    }

    private static long getCount(List<Integer> numbers) {
        return numbers.stream().count();
    }

    private static int getMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo).orElse(0);
    }

    private static int getMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElse(0);
    }

    private static int getSum(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.summingInt(Integer::intValue));
    }
}

