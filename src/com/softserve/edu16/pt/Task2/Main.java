package com.softserve.edu16.pt.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("mytext.txt"))
                .toArray(String[]::new);
        Function<CharSequence, Stream<String>> splitter =
                Pattern.compile("[^a-zA-Z`-]+")::splitAsStream;
        String vow = "ioueay";
        Arrays.stream(lines)
                .flatMap(splitter)
                .filter(l -> !l.isBlank())
                .filter(w -> vow.contains(w.substring(0, 1)))
                .forEach(System.out::println);
       var iter =  Arrays.stream(lines)
                .flatMap(splitter)
               .filter(w -> !w.isEmpty())
                .iterator();
       String p1 = iter.next();
       while (iter.hasNext()) {
           String next = iter.next();
           if (next.charAt(0) == p1.charAt(p1.length()-1)) {
               System.out.println( p1 + " " + next);
           }
           p1 = next;
       }
    }
}
