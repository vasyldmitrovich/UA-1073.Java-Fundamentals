package com.softserve.edu16.hw.task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        try (var fis = Files.lines(Path.of("src/com/softserve/edu16/hw/task01/text1.txt"))) {
            var lines = fis.toArray(String[]::new);
            var longestLine = Arrays.stream(lines)
                    .max(Comparator.comparing(String::length))
                    .orElse("There are no lines in file text1.txt!");
            Files.write(Path.of("src/com/softserve/edu16/hw/task01/text2.txt"),
                    Arrays.asList(Integer.toString(lines.length), longestLine, "Serhii Zamorii, 1977-07-25"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
