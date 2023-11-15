package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.util.*;

public class Task1 {
    public static final Random random = new Random();

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(createProduct());
        }

        List<Product> sortedList = list.stream().sorted(Comparator.comparingInt(Product::getPrice)).filter(i -> {
            var today = LocalDate.now();
            return i.getCategory().equals(Category.PHONE.getName()) && i.getDate().isBefore(today.minusYears(10));
        }).toList();

        System.out.println(sortedList);
    }

    public static Product createProduct() {
        return new Product(Category.randomCategory(), randomDate(),random.nextInt(0, 100));
    }

    public static LocalDate randomDate( ) {
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}

