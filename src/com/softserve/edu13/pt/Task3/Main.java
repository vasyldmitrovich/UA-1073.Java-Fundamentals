package com.softserve.edu13.pt.Task3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Megan","Josh", "Anna");
        names.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(names);
        }

}
