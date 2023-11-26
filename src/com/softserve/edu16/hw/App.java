package com.softserve.edu16.hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

class App {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Path.of("src/com/softserve/edu16/hw/file 1.txt");
        String[] strings;
        IntSummaryStatistics stats;
        try (Stream<String> stream = Files.lines(pathToFile)) {
            strings = stream
                    .toArray(String[]::new);
            stats = Arrays.stream(strings)
                    .filter(line -> !line.isBlank())
                    .mapToInt(String::length)
                    .summaryStatistics();
        }

//HW1
        Path pathToFile2 = Path.of("src/com/softserve/edu16/hw/file2.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile2.toFile()))) {
            bw.write("Number of lines in file 'file 1.txt' - " + strings.length);
            List<String> longestLines = Arrays.stream(strings)
                    .filter(line -> line.length() == stats.getMax())
                    .toList();
            bw.write("\nThe longest line in file 'file 1.txt'\n");
            longestLines.forEach(line -> {
                try {
                    bw.write(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.write("\nMe name is Petro and my birthday - 11.06.1990");
        }

//HW 2
        Path pathSourceCode = Path.of("src/com/softserve/edu11/hw/FiveWords.java");
        Path pathDestination = Path.of("src/com/softserve/edu16/hw/Destination.java");

        String[] stringsOfCode;

        try (Stream<String> stream = Files.lines(pathSourceCode)) {
            stringsOfCode = Arrays.stream(stream.toArray(String[]::new))
                    .filter(line -> !line.isBlank())
                    .map(s -> s.replace("public", "private"))
                    .toArray(String[]::new);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathDestination.toFile()));
             Stream<String> stream = Arrays.stream(stringsOfCode)) {
            stream
                    .forEach(line -> {
                        try {
                            bw.write(line + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }
}
