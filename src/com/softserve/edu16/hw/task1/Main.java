package com.softserve.edu16.hw.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:/Users/Asus/Desktop/file1.txt");

        String[] lines = Files.lines(path).toArray(String[]::new);
        String firstAndLastName = lines[0];
        String birthdayDate = lines[1];


        String resultPath = "C:/Users/Asus/Desktop/file2.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultPath))) {
            bw.write("Number of lines: " + lines.length + "\n");
            bw.write("The longest line in file: '" + getTheLongestLine(lines) + "'\n");
            bw.write("First and last name: " + firstAndLastName + "\n");
            bw.write("Birthday date: " + birthdayDate + "\n");

        }
    }

    public static String getTheLongestLine(String[] lines) {
        return Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .orElse("The longest line not found.");
    }
}