package com.softserve.edu16.IOStreamі.hw.task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String filePath = "C:/workplace/Courses/file3.java";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);

            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, lines.get(i).replaceAll("\\bpublic\\b", "private"));
            }

            String outputFilePath = "C:/workplace/Courses/java4.java";
            Files.write(Paths.get(outputFilePath), lines, StandardCharsets.UTF_8);
            System.out.println("Code copied");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}