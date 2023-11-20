package com.softserve.edu16.IOStreamі.hw.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {
        var file1 = Files.lines(Path.of("C:/workplace/Courses/file1.txt"))
                .toArray(String[]::new);
        Path file2 = Path.of("C:/workplace/Courses/file2.txt");
        try{
        try (BufferedWriter writer = Files.newBufferedWriter((Path) file2, StandardOpenOption.CREATE)) {
            writer.write("Count of lines at file1.txt: " + file1.length);
            writer.newLine();
            String longestLine = String.valueOf(Arrays.stream(file1)
                    .max(Comparator.comparing(String::length)));
            writer.write("Longest line: " + longestLine);
            writer.newLine();
            writer.write("Zinnyk Oleksiy 10.02.2004");
        }

        System.out.println("Count of lines at file1 wrote " + file2);
        } catch(IOException e) {
        System.err.println("Error: " + e.getMessage());
    }
}
}
