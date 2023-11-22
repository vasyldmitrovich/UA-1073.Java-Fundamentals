package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = Product.createList();
        Product.filerAndSortedByPrice(list);

    }
}

