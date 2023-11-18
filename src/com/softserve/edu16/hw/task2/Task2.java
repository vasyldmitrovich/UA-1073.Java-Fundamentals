package com.softserve.edu16.hw.task2;

import com.softserve.global.Global;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task2 {
    private static final String PATH_PACKAGE = Global.getPath("/src/com/softserve/edu16/hw/task2");

    public static void main(String[] args) {
        try (Stream<String> file = Files.lines(Path.of(PATH_PACKAGE + "/file1.txt"))) {
            String[] lines = file.toArray(String[]::new);

            String[] newLines = replaceWithPrivate(lines);

            File newFile = new File(PATH_PACKAGE + "/file2.txt");
            PrintWriter pr = new PrintWriter(newFile);
            for (String line : newLines) {
                pr.println(line);
            }

            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] replaceWithPrivate(String[] lines) {
        String[] newLines = Arrays
                .stream(lines)
                .map(i -> i.replaceAll("public", "private"))
                .toArray(String[]::new);
        return newLines;
    }
}
